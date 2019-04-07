/**
  * Created by rkrovvidi on 4/6/19.
  */


//import java.io._
//import java.math._
//import java.security._
//import java.text._
//import java.util._
//import java.util.concurrent._
//import java.util.function._
//import java.util.regex._
//import java.util.stream._

import scala.collection.mutable

object Array_Values_Pairs_hacker_rank_Sock_Merchant {

  // Complete the sockMerchant function below.
  def sockMerchant(n: Int, ar: Array[Int]): Int = {

    //val lstArr = ar.toList
    //val arrSorted = scala.util.Sorting.quickSort(ar)
    val lstArr = ar.toList
    val sortedLstArr =lstArr.sorted




    //for((ctr,ctrValue) <- sortedLstArr.zipWithIndex)

   // var lstOfLists:List[List[Int]] = scala.collection.mutable.MutableList(List[Int])

    var lstOfLists:List[List[Int]] = Nil
    var lstChild:List[Int] = List()
    //println(1000 :: lstChild)



    var totalPairCount = 0;
    for((ctr,ind) <- sortedLstArr.zipWithIndex)
    {
      println("counter"+ind)
      println("value"+ctr)
      //when items are same
      if(ind == 0 || lstChild.exists(item => item==ctr)) {

        println("ctr value:"+ctr)
        lstChild = ctr :: lstChild
        println("lstChild content: "+lstChild.toString())
      }  else {

        println("lstChild content in else: "+lstChild.toString())
            
            if(lstChild.length !=1 && lstChild.length%2==0)
            {

                 totalPairCount=totalPairCount+(lstChild.length/2)
               println("added to totalPairCount in if:"+totalPairCount)
            }
            else if(lstChild.length !=1 && lstChild.length%2!=0)
            {
                  totalPairCount=totalPairCount+(lstChild.length-1)/2
              println("added to totalPairCount in else:"+totalPairCount)
            }

            //val addChildList =  lstChild
            //lstOfLists=addChildList::lstOfLists

        lstOfLists=lstChild::lstOfLists
            //lstChild = lstChild.filter(_ >=0)
        lstChild = Nil
            println("after clearing lstChild:"+lstChild)
            lstChild=ctr::lstChild
        println("after adding new element:"+lstChild)
      }
    }



    if(lstChild.length !=1 && lstChild.length%2==0)             
    {
         totalPairCount=totalPairCount+(lstChild.length)/2
       println("added to totalPairCount in if:"+totalPairCount)

    }
    else if(lstChild.length !=1 && lstChild.length%2!=0)
    {
          totalPairCount=totalPairCount+(lstChild.length-1)/2
      println("added to totalPairCount in else:"+totalPairCount)     
    }
    lstOfLists=lstChild::lstOfLists

    print("list of lists"+lstOfLists)
          return totalPairCount
  }

  def main(args: Array[String]) {

    /*
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = sockMerchant(n, ar)

    printWriter.println(result)

    printWriter.close()
    */

    //val arr1:Array[Int] =Array(1,1,2,2,3,3,4,4)
    val arr1:Array[Int] =Array(10, 20, 20, 10, 10, 30, 50, 10, 20)

    val result = sockMerchant(9, arr1)
    println(result)

  }
}
