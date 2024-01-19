package kotlin_playground.sandboxes

class NullSandbox {
  companion object {
    fun nuller() {
      val nullable: String? = null
      println("nullable is null -> ${nullable?.length}")
    }
  }
}