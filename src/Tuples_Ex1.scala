object Tuples_Ex1 extends App{

  //Tuples are fixed-length collections of values, which may be of different types
  val tup1 = (100, "universe", true)
  println(tup1)
  println(tup1._1)
  println(tup1._2)
  println(tup1._3)

  val tup2: (Int, String, Boolean,Long,Float,Double) = (100, "god",true,34L,3.44F,34.5D)
  println(tup2)
  //Tuples come in any size from 1 to 22 items
  /*
  val tup3: (Int, Boolean, String) = (1, true, "hello")

  val (a, b, c) = tup3
  a: Int = 1
  b: Boolean = true
  c: String = "hello"

   */



}

