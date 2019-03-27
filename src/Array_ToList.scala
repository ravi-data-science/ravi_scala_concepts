/**
  * Created by rkrovvidi on 3/27/19.
  */
object Array_ToList extends App{

  val array_1 = Array("one", "two")
  val array_2 = Array.apply("one", "two")

  println(array_1)
  println(array_2)


  println(array_2(0))

  println(array_1.toList)
  println(array_2.toList)



  val twoThree = List(2, 3)
  val oneTwoThree = 1 :: twoThree
  println(oneTwoThree)




}
