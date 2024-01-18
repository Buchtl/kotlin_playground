package kotlin_playground.date

import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import kotlin.test.assertEquals

class DateUtilsTest {

  //2024-01-18T18:55:00.366190294
  //LocalDateTime.of(year = 2024, month = 1, dayOfMonth = 18, hour = 18, minute = 55, second = 0, nanoOfSecond = 366190294
  private val dateTo: LocalDateTime = LocalDateTime.of(2024, 1, 8, 18, 55, 0, 366190294)

  private val unsortedDates = listOf(
    LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294),
    LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294),
    LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294),
    LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294),
    LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294),
    LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294),
    LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294),
    LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294),
    LocalDateTime.of(2024, 1, 18, 18, 55, 0, 366190294)
  )

  @Test fun testNormalizeDate() {
    val expected = "2024-01-08"
    assertEquals(expected, DateUtils().normalizeDate(dateTo.toString()))
    assertEquals(expected, DateUtils().normalizeDate("2024-01-8"))
    assertEquals(expected, DateUtils().normalizeDate("2024-1-08"))

  }

  @Test fun testDateToInt() {
    val expected = 20240108
    assertEquals(expected, DateUtils().dateToInt("2024-01-08"))
    assertEquals(expected, DateUtils().dateToInt("2024-01-8"))
    assertEquals(expected, DateUtils().dateToInt("2024-1-08"))
  }
}