package kotlin_playground.date

import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import kotlin.test.assertEquals

class DateUtilsTest {

  //2024-01-18T18:55:00.366190294
  //LocalDateTime.of(year = 2024, month = 1, dayOfMonth = 18, hour = 18, minute = 55, second = 0, nanoOfSecond = 366190294
  val dateTo = LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294)

  @Test
  fun testNormalizeDate(){
    val expected = "2024-01-18"
    assertEquals(expected, DateUtils().normalizeDate(dateTo))

  }

  @Test
  fun testDateToInt() {
    val expected = 20240118
    assertEquals(expected, DateUtils().dateToInt(dateTo))
  }
}