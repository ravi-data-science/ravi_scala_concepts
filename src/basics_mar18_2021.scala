object basics_mar18_2021 extends App {

  println("in main via App")
  val lst_str1 = "hello world".split('w')
  println(lst_str1)
  println(lst_str1.toList)

  val int1 = 10
  println(s"the value of int1 is $int1 & add one is ${int1+1}")

  println(Int.MinValue)
  println(Int.MaxValue)
  println(Boolean.getClass)
  println(BigInt.int2bigInt(10))
  println(19.45.toInt)
  println(19.toFloat)
  val num1 = 1000L
  num1.isValidByte
  num1.isValidInt
  num1.isValidShort

}
