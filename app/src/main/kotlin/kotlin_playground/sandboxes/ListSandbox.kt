package kotlin_playground.sandboxes

class ListSandbox {
  companion object {
    fun split(){
      val index = 5
      val values: List<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9).also{ it.removeAt(it.indexOf(index)) }
      println("Split at index $index ")
      val grouped = values.groupBy { it > 5 }
      println("group true: ${grouped[true]}")
      println("group false: ${grouped[false]?.reversed() }")
    }
  }
}