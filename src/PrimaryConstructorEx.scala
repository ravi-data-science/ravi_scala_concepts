object PrimaryConstructorEx extends App{

  val acc1:Account = new Account("optionsTrading",3000000)

}

class Account (var accName: String, var accVal: Double){
  /*
  primary constructor is combination of
  The constructor parameters
  Methods that are called in the body of the class
  Statements and expressions that are executed in the body of the class
  */
  println("begin")

  // this is private and final
  private val HOME = System.getProperty("user.home")
  var bonus = 100000

  // some methods
  override def toString = s"$accName has value $accVal and bonus $bonus"
  def printHome { println(s"HOME = $HOME") }
  def printAcc { println(this) }  // uses toString
  printHome
  printAcc
  println("end")

  /*
Because the fields accName and accVal are mutable, Scala generates both accessor and mutator methods for them
mutator method is named like accName_$eq
  public void accName_$eq(String accName) {
  this.accName = accName;
}

Anything defined within the body of the class other than method declarations is a part of the primary class constructor.
Because auxiliary constructors must always call a previously defined constructor in the same class, auxiliary constructors will also execute the same code.
*/

}