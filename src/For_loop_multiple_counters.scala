object For_loop_multiple_counters extends App {
  //‘for’ loops (expressions) with multiple counters (multi-dimensional arrays)

  val lst1 = List(10,20,30)
  val lst2 = List("orange","blueberry","apple")
  val lst3 = List("US","china")

  for {
    ctr1 <- lst1
    ctr2 <- lst2
    ctr3 <- lst3
  } println(s"ctr1 = $ctr1, ctr2 = $ctr2, k = $ctr3")


}
