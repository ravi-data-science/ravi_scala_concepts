object VectorEx extends App{

  val vtr = Vector(1, 2, 3)
  vtr.sum                   // 6
  vtr.filter(_ > 1)         // Vector(2, 3)
  vtr.map(_ * 2)            // Vector(2, 4, 6)

}
