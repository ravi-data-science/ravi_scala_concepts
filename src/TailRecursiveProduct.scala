object TailRecursiveProduct extends App{

  import scala.annotation.tailrec
  val lst1 = List(1, 2, 3,4)
  print(add_with_tailrec(lst1))

  def add_with_tailrec(inputLst: List[Int]): Int = {
    @tailrec
    def productAccumulator(inputLst: List[Int], collectProduct: Int): Int = {
      inputLst match {
          case Nil => collectProduct
        case headContent :: tail => productAccumulator(tail, collectProduct * headContent)
      }
    }

    productAccumulator(inputLst, 1)
  }
/*
Iterations
1 st - 1*1
2 nd - 1*2
3 rd - 2 *3
4 rth - 6*4
 */

}
