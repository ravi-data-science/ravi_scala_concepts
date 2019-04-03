/**
  * Created by rkrovvidi on 4/3/19.
  */
object Array_Sum extends App{


  val arr = Array(1,2,4,5,7)

  var sum1 =0
  val arr_sum = for(ctr <- arr)
  {

    println(ctr)

    sum1 = sum1 + ctr

  }

  println(sum1)

  println(arr_sum)

  val arr_sum_1 = for(ctr <- arr)
    yield
  {

    println(ctr)

    ctr

  }

  println(arr_sum_1.toList)



  var sum2=0
  val arr_sum_2 = for(ctr <- arr)
    yield
      {

        sum2 = sum2+ctr
        sum2

      }

  println(arr_sum_2.toList)

}
