/**
  * Created by rkrovvidi on 4/3/19.
  */


import scala.collection.immutable._
object ListMap_immutable{
  def main(args:Array[String]){
    var listMap = ListMap("Rice"->"100","Wheat"->"50","Gram"->"500")    // Creating listmap with elements
    var emptyListMap = new ListMap()            // Creating an empty list map
    var emptyListMap2 = ListMap.empty           // Creating an empty list map
    println(listMap)
    println(emptyListMap)
    println(emptyListMap2)
  }
}