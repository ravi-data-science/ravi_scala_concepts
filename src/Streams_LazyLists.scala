/**
  * Created by rkrovvidi on 3/24/19.
  */
object Streams_LazyLists extends App {

  //A Stream is like a list except that its elements are computed lazily.
  // Because of this, a stream can be infinitely long. Only those elements requested are computed.
  // Otherwise, streams have the same performance characteristics as lists.

  val str = 1 #:: 2 #:: 3 #:: Stream.empty
  val str_1 = Stream(1,2,3)

  println(str_1)
  println(str_1.toString())
  println(str_1.toList)
}
