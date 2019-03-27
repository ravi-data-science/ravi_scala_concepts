/**
  * Created by rkrovvidi on 3/25/19.
  */
object Mutable_Set extends App{

  //mutable set
  val jetSet = scala.collection.mutable.Set("Boeing", "Airbus")
  jetSet += "Lear"

  println(jetSet)

}
