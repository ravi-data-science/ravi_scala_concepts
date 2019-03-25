/**
  * Created by rkrovvidi on 3/25/19.
  */
object ForEach extends App{

  val arr = Array("apple","banana","pears")
  arr.foreach(e => println(e.toUpperCase))

  arr.foreach{
    e =>fun1(e)
  }

  def fun1(str:String): Unit={
    println("in fun1"+str)
  }

}
