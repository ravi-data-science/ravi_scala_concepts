/**
  * Created by rkrovvidi on 3/24/19.
  */
object ImmutableQueue extends App{


  //A Queue is just like a stack except that it is first-in-first-out rather than last-in-first-out.

  val emptyQueue = scala.collection.immutable.Queue[Int]()
  val has1 = emptyQueue.enqueue(1)

  println(has1)

  val has123 = has1.enqueue(List(2, 3))
println(has123)

  
}
