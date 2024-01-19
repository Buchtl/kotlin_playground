package kotlin_playground.sandboxes

import kotlin_playground.data.ObjectWithValidity
import java.time.LocalDateTime

class DateSandbox {
  companion object {
    fun objectWithValidity() {
      val data = ObjectWithValidity(validFrom = null, validTo = LocalDateTime.now())
      println(data.validTo)
    }
  }
}