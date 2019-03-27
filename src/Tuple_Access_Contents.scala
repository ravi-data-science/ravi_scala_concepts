/**
  * Created by rkrovvidi on 3/27/19.
  */
object Tuple_Access_Contents extends App{


  //tuple
  val pair = (99, "Luftballons")
  println(pair._1)
  println(pair._2)


  pair.productIterator.foreach(println)

//  for(ctr <- pair) {
//
//println(ctr)
//    //println(pair.(ctr))
//  }


}
