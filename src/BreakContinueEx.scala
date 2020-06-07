
import scala.util.control.Breaks._

/*
private val breakException = new BreakControl
def break(): Nothing = { throw breakException }
 */

object BreakContinueEx extends App{

val lst1 = List(1,2,3,4,5)
  for (ctr <- lst1) {
    breakable {
      if (ctr == 3) {
        break  // break out of the 'breakable'
      } else {
        println(ctr)
      }
    }
    println("continuing next statement")
  }
}
