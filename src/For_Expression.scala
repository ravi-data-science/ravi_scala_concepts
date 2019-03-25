/**
  * Created by rkrovvidi on 3/24/19.
  */
object For_Expression {


  def main(args : Array[String]): Unit = {


    f(3)

    def f(inputTimes : Int):Unit = {

      for(cntr <- 1 to inputTimes) {
        println("hello world")

      }

      for(cntr <- 1 to inputTimes)

        yield {

          println("hello world")

        }


      val threeFor = for(cntr <- 1 to inputTimes)

        yield {

          print("in 3rd for")
          cntr

        }

      println("threeFor:"+threeFor)


      val fourFor = for{

        cntr <- 1 to inputTimes
        if(cntr >1)

      }

        yield {

          println("in 4 th for")
          cntr

        }


      println("4th for:"+fourFor)



    }



  }
}
