object AnonymousFunctionEx extends App{

  //(i: Int) => i % 2 == 0
  //_ % 2 == 0

  val lst1 = List.range(1, 10)
  println(lst1)

  //get only even values from list
  val evenLst = lst1.filter((i: Int) => i % 2 == 0)
  println(evenLst)

  val evenLst1 = lst1.filter(_ % 2 == 0)
  println(evenLst1)

  //also can be written as
  for {
    elemnt <- lst1
    if elemnt % 2 == 0
  } yield elemnt
//Collection methods like filter, foreach, map, reduceLeft, and many more have loops built into their algorithms.

}
