/**
  * Created by rkrovvidi on 3/27/19.
  */
object Array_ToList extends App {

  val array_1 = Array("one", "two")
  val array_2 = Array.apply("three", "four")
  println(array_1)
  println(array_2)
  println(array_1(0))
  println(array_2(1))
  println(array_1.toList)
  println(array_2.toList)

  val lst1 = List(2, 3)
  val lst2 = 1 :: lst1
  println(lst2)

  //If the method name ends with ':', it is invoked on right operand, In this case Integer 4 doesn't have this method
  //val lst3 = lst1 :: 4

  val lst3 = lst1::lst2
  println(lst3)
}
