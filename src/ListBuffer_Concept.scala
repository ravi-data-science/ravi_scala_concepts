
object ListBuffer_Concept extends App {

  import scala.collection.mutable.ListBuffer

  val zs = List(1, 2, 3)

  val buf = new ListBuffer[Int]
  for (y <- zs) buf += y + 1
  println(buf.toList)

}
