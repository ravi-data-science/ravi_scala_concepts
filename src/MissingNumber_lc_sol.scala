object MissingNumber_lc_sol extends App {

  val arr = Array(0, 3, 1)
  println("missing number ::"+missingNumber(arr))

  val arr1 = Array(0)
  println("missing number ::"+missingNumber(arr1))

  val arr2 = Array(0, 1)
  println("missing number ::"+missingNumber(arr2))

  val arr3 = Array(1)
  println("missing number ::"+missingNumber(arr3))

  /*
  def missingNumber(nums: Array[Int]): Int = {
    val setIntsLst = (0 to nums.max + 1).toSet
    println(setIntsLst)
    val diffSet = setIntsLst.diff(nums.toSet)
    println(diffSet)
    var elemMissing = 0
    for (elem <- diffSet) {
      println(elem)
      elemMissing = elem

    }
    return elemMissing
  }
*/

  import java.util

  def missingNumber(nums: Array[Int]): Int = {
    util.Arrays.sort(nums)
    // Ensure that n is at the last index
    if (nums(nums.length - 1) != nums.length) return nums.length
    else { // Ensure that 0 is at the first index
      if (nums(0) != 0) return 0
    }
    // If we get here, then the missing number is on the range (0, n)
    for (i <- 1 until nums.length) {
      val expectedNum = nums(i - 1) + 1
      if (nums(i) != expectedNum) return expectedNum
    }
    // Array was not missing any numbers
    return -1
  }
}
