object Array_All_Types extends App{

  val intArr = Array(1,3,4,5)
  println(intArr.mkString("\n"))

  val floatArr = Array(3.4,4.5)
  println(floatArr.mkString("\n"))

  val strArr = Array("sky","ocean")
  println(strArr.mkString("\n"))

  val strArr1:Array[String] = Array("sky","ocean")
  println(strArr1.mkString("\n"))

  val dArr:Array[Double] = new Array[Double](3)
  dArr(0) = 1.4d
  println(dArr.mkString(" "))

  //multi dimensional array
  val multiDimArr1 = Array(Array(1,2,3),Array(3,4,5),Array(5,6))
  println(multiDimArr1(0).mkString(" "))
  println(multiDimArr1(1).mkString(" "))
  println(multiDimArr1(2).mkString(" "))

}
