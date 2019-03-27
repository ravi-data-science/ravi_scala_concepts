/**
  * Created by rkrovvidi on 3/25/19.
  */
object Immutable_Set extends App{
  //immutable set
  var jetSet = scala.collection.immutable.Set("Boeing", "Airbus")
  jetSet += "Lear"

  println(jetSet)

}
