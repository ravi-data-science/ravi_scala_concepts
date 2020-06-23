//import scala.collection.immutable.HashMap

import Array._

object TwoSum_Sol extends App {

  /*
  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
   */

  val arr1 = Array(1, 8, 11, 15)
  println(twoSum(arr1, 9).mkString(" "))

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var hmap1 = Map[Int, Int]()
    for ((elem, ctr) <- nums.zipWithIndex) {
      val complement: Int = target - elem
      if (hmap1.contains(complement)) {
        //return Array(hmap1.get(complement), ctr) this gives error found Option[Int] required Int
        return Array(hmap1(complement), ctr)
      }
      hmap1 += (elem -> ctr)
    }
    throw new IllegalArgumentException("No two sum solution")
  }

}
