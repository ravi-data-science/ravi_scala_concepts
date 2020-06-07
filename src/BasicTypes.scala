object BasicTypes extends App {

  val byt1: scala.Byte = 1
  println(byt1)

  val shrt1: scala.Short = 2
  println(shrt1)

  val int1: scala.Int = 3
  println(int1)

  val long1: scala.Long = 4
  println(long1)

  val chr1: scala.Char = 'a'
  println(chr1)

  val str1: java.lang.String = "abc"
  println(str1)

  val flt1: scala.Float = 20.7f
  println(flt1)

  val dbl: scala.Double = 73.7d
  println(dbl)

  /*

Byte - 8-bit signed two's complement integer (-27 to 27 - 1, inclusive)
Short - 16-bit signed two's complement integer (-215 to 215 - 1, inclusive)
Int - 32-bit signed two's complement integer (-231 to 231 - 1, inclusive)
Long - 64-bit signed two's complement integer (-263 to 263 - 1, inclusive)
Char - 16-bit unsigned Unicode character (0 to 216 - 1, inclusive)
String - a sequence of Chars
Float - 32-bit IEEE 754 single-precision float
Double - 64-bit IEEE 754 double-precision float
Boolean - true or false

//Other than String, which resides in package java.lang, all of the types are members of package scala.

   */
}
