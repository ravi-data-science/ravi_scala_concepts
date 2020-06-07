object CaseClassCopy extends App {


  case class Person(firstName: String, lastName: String) {
//    def copy(firstName: String = this.firstName, lastName:String="",country:String) =
//      new Person(firstName, lastName)

    def copy(firstName: String = this.firstName, lastName:String=" ") =
          new Person(firstName, lastName)
  }

  val p1 = new Person("lady", "gaga")
  println(p1)
  val p2 = p1.copy("taylor")
  println(p2)

//  val p3 = p1.copy("taylor",country="india")
//  println(p3)
}
