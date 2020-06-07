object ForYieldComprehension extends App{

  val lst1 = List(10, 20, 30)

  val forComprehensionVal = for (ctr <- lst1)
    yield {
      ctr + 1
    }
  print(forComprehensionVal)
}
