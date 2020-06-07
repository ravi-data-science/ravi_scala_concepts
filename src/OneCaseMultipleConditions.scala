object OneCaseMultipleConditions extends App {

  val i1 = 7
  isEvenOrOddBelowTen(i1)
  isEvenOrOddAnyNumber(i1)
  val i2=2
  isEvenOrOddBelowTen(i2)
  isEvenOrOddAnyNumber(i2)

  def isEvenOrOddBelowTen(i1: Int) {

    i1 match {
      case 1 | 3 | 5 | 7 | 9 => println(i1+" is odd")
      case 2 | 4 | 6 | 8 | 10 => println(i1+" is even")
    }
  }

  def isEvenOrOddAnyNumber(i1: Int) {

    (i1%2) match {
      case 0 => println(s"$i1 is even")
      case 1 => println(s"$i1 is odd")
    }
  }
}
