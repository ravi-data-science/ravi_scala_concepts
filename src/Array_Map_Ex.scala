object Array_Map_Ex extends App{

  val arr1 = Array(1, 2, 3).map(i => i * 2)
  println(arr1.toList)

  val arr2 = Array(1, 2, 3).map(i => addStr(i))

  def addStr(i:Int): String = {

   return (s"value of array element is $i")
  }
  println(arr2.toList)

}
