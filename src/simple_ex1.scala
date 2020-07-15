object simple_ex1 extends App {

  val v1 = List(1, 2, 3, 4, 5, 3, 2)
  var sum1 = 0;
  //v1.toSet();

  val v2 = v1.toSet;
  var hashmap1 = Map[Int, Int]()

  //hashmap1 += (hashmap1.get(ctr1) -> 1)

  //hashmap1 += (6 -> 1)


  for (ctr1 <- v1) {
    println(ctr1)

    sum1 = sum1 + ctr1
    if (hashmap1.get(ctr1) != None) {
      //hashmap1 += (ctr1 -> 1)
      //increment the val
      //var v11 = hashmap1.get(ctr1)

      hashmap1 += (ctr1 -> (hashmap1(ctr1)+1))
    } else {
      hashmap1 += (ctr1 -> 1)
    }
  }
  println(sum1)
println(hashmap1.toList)
  /*
  // iterate over hashmp
  hashmap1

  1 -> 1
  2 -> 2
  3 -> 2
  4 -> 1
  5 -> 1
*/
  var sumNonUnique = 0
  for((k,v) <- hashmap1) {
    println(k)
    println(v)

    if(v > 1) {
      sumNonUnique = sumNonUnique+(k*v)
    }

  }
  println(sumNonUnique)

}
