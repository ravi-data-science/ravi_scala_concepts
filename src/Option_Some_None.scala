/**
  * Created by rkrovvidi on 3/24/19.
  */
object  Option_Some_None extends App{

  /*

  instead of returning one object when a function succeeds and null when it fails, your function should instead return an instance of an Option, where the instance is either:

    An instance of the Scala Some class
    An instance of the Scala None class

Because Some and None are both children of Option, your function signature just declares that you're returning an Option that contains some type (such as the Int type shown below).
At the very least, this has the tremendous benefit of letting the user of your function know what’s going on.
   */

  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: NumberFormatException => None
    }
  }
  toInt("fake") match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
  }

  val bag = List("1", "2", "foo", "3", "bar")
  /*
  Let's assume you want to get the sum of a List that contains a bunch of String values, and some of those strings can be converted to Int values, and some can't:
   */

  /*
Because (a) we've written toInt to return either a Some[Int] or None value, and (b) flatMap knows how to handle those values,
 writing this line of code is a piece of cake, and again, it's easy to read and understand.
 */

  val sum = bag.flatMap(toInt).sum
  println(sum)


}
