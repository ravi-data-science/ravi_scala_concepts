object PredicateEx extends App{

  //A predicate is simply a method, function, or anonymous
  // function that takes one or more parameters and returns a Boolean value. For instance, the following method returns true or false, so it’s a predicate:

  def isEven (i: Int) = if (i % 2 == 0) true else false
  def isOdd (i: Int) = if (i % 2 != 0) true else false

  println(isEven(2))
  println(isEven(3))
  println(isOdd(3))

}
