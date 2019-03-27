/**
  * Created by rkrovvidi on 3/25/19.
  */
object For_Loop_Over_Map extends App{


  val names = Map("fname" -> "Robert", "lname" -> "Goren")

  for ((k,v) <- names) println(s"key: $k, value: $v")


  for ((k,v) <- names) {
    println(k)
    println(v)
  }


}
