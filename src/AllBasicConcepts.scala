object AllBasicConcepts extends App {

  println("in main via App")

  //type inference
  val strImplicit = "god"
  val strExplicit: java.lang.String = "Universe"
  println(strImplicit)

  val multiLine = "" +
    "" +
    "nature is beautiful" +
    ""
  println(multiLine)
  println(addNumbers(2,3))
  println(addNumbers(-2,-3))

  def addNumbers(a:Int, b:Int):Int=
  {

    if (a >0 && b>0)
    return a+b
    else
      return scala.math.abs(a)+scala.math.abs(b)

  }

  // while loop

  var ctr = 0
  while (ctr <5) {

    println(ctr)

    //i = i + 1 or i += 1
    ctr= ctr+1
  }

  //functions are first class constructs
  args.foreach(arg => println(arg))
  args.foreach((arg: String) => println(arg))
//If a function literal consists of one statement that takes a single argument, you need not explicitly name and specify the argument
  args.foreach(println)

  //In Java, the type of the value returned from a method is its return type. In Scala, that same concept is called result type.

  //good idea to indicate function result types explicitly, even when the compiler doesn't require it.
  // Such type annotations can make the code easier to read, because the reader need not study the function body to figure out the inferred result type.

  //In an effort to guide you in a functional direction,
  // only a functional relative of the imperative for (called a forexpression) is available in Scala.


}


