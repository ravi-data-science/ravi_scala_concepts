import scala.collection.mutable.ArrayBuffer

/**
  * Created by rkrovvidi on 3/24/19.
  */
object ArrayBuffer_Concept extends App{


  // general-purpose collections class for mutable, indexed sequential collections.
//ArrayBuffer is an indexed sequential collection. Use ListBuffer if you prefer a linear sequential collection that is mutable.



  var fruits = ArrayBuffer[String]()
  var ints = ArrayBuffer[Int]()
  var people = ArrayBuffer[Person]()

  // ready to hold 100,000 ints
  val buf = new ArrayBuffer[Int](100000)



  val nums = ArrayBuffer(1, 2, 3)

//  val people_1 = ArrayBuffer(
//    Person("Al"),
//    Person("Kim"),
//    Person("Jim")
//  )


  val lst:List[Int] = nums.toList
  println(lst)

}

class Person(var name: String){}
