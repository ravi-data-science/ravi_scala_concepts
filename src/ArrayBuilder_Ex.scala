object ArrayBuilder_Ex extends App {
  val arrb1 = Array.newBuilder[Int]
  arrb1 += 10
  arrb1 += 20
  arrb1 += 30
  arrb1 += 40
  arrb1 += 50
  arrb1.result()
println(arrb1.result())
//arrb1.foreach(println)
  println(arrb1.toString())

  val arrb2 = Array(10,20,30)
  println(arrb2.mkString(" "))
  arrb2.foreach(println)

  val arrb3 = Array(1, 2, 3) ++ Array(4, 5, 6)
  arrb3.foreach(println)


}
