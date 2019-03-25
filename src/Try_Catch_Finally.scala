/**
  * Created by rkrovvidi on 3/24/19.
  */
object Try_Catch_Finally extends App {


  def strToInt(input: String): Int = {

    try {
      input.toInt
    } catch {
      case exception_1: NumberFormatException => 0
    }
    finally {
      println("do some cleanup from this finally, regardless of try or catch")
    }

  }


  println(strToInt("10"))
  println(strToInt("fake"))

}
