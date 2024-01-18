package kotlin_playground.date

import java.time.LocalDateTime

class DateUtils {

  fun normalizeDate(date: String): String {
    val regex = Regex("[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}")
    val result = StringBuilder()
    regex.find(date)?.value.let { normDate ->
      normDate?.split("-")?.forEach { token ->
        if (token.length == 1) {
          result.append("0$token")
        } else {
          result.append(token)
        }
        result.append("-")
      }
    }
    return result.substring(0, result.lastIndex).toString()
  }

  fun dateToInt(date: String): Int {
    return normalizeDate(date.toString()).replace("-", "").toInt()
  }
}