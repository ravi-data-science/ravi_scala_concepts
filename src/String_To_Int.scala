/**
  * Created by rkrovvidi on 3/24/19.
  */
object String_To_Int extends App{

  println(toInt("3"))
  println(toInt_using_Option_None("xyz"))

  def toInt(s: String): Int = {
    try {
      s.toInt
    } catch {
      case e: NumberFormatException => 0
    }
  }


  def toInt_using_Option_None(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e1: NumberFormatException => None
      case e: Exception => None
    }
  }


}

