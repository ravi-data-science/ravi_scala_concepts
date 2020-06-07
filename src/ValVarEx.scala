object ValVarEx extends App{

  val str1 = "nature"
  println(str1)

  //Error - reassignment to val
  //str1="illegal"

  //var can be reassigned throughout its life
  var str2 = "beautiful"
  println(str2)

  str2 = "diverse"
  println(str2)
}
