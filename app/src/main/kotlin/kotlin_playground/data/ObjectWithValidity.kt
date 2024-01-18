package kotlin_playground.data

import java.time.LocalDateTime


data class ObjectWithValidity(var validFrom: LocalDateTime?, var validTo: LocalDateTime?) {
}
