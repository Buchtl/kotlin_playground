package kotlin_playground.date

import java.time.LocalDateTime

class DateUtils {

  fun normalizeDate(date: LocalDateTime): String {
    val pattern = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}"
    val regex = Regex(pattern)
    return regex.find(date.toString())?.value ?: ""
  }

  fun dateToInt(date: LocalDateTime): Int {
    return normalizeDate(date).replace("-", "")
      .toInt()
  }

}