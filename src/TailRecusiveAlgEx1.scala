
import scala.annotation.tailrec

object TailRecusiveAlgEx1 extends App {

  val lst1 = List(1, 2, 3)
  print(add_with_tailrec(lst1))

  def add_with_tailrec(inputLst: List[Int]): Int = {
    @tailrec
    def sumAccumulator(inputLst: List[Int], collectSum: Int): Int = {
      inputLst match {
        case Nil => collectSum
        case headContent :: tail => sumAccumulator(tail, collectSum + headContent)
      }
    }

    sumAccumulator(inputLst, 0)
  }

}
