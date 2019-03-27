/**
  * Created by rkrovvidi on 3/24/19.
  */
object List_multiple_ways extends App{

//list style
  val lst_1 = 1 :: 2 :: 3 :: Nil

  println(lst_1)

  // java style
  val lst_2 = List(1,2,3)

  lst_2.foreach{println}

  println(lst_2)

  //if you're going to mix types in a List constructor, you may need to manually specify the type of the List.
  val lst_3 = List[Number](1, 2.0, 33d, 0x1)

  println(lst_3)


  //range
  val lst_4 = List.range(1, 10)
  println(lst_4)


  //fill entire list
  val lst_5 = List.fill(3)("foo")
  println(lst_5)


  //The tabulate method creates a new List whose elements are created according to the function you supply.
  //  The book Programming in Scala shows how to create a List using a simple "squares" function with the tabulate method:
  val lst_6 = List.tabulate(5)(n => n * n)

  println(lst_6)



}
