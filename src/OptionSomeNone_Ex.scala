object OptionSomeNone_Ex extends App{

    //Scala's Option[T] type allows you to represent a value that may or may not exist.
  // An Option[T] can either be Some(v:T) indicating that a value is present, or None indicating that it is absent

  println(displayValue(Option("rocks")))

  println(displayValue(None))

  def displayValue ( optionalVal: Option[String]) = {
    optionalVal match {
      case Some(optionalVal) => println(s"$optionalVal"+"\n"+Some(optionalVal).getOrElse("NA"))
      case None => println(s"$optionalVal meaning optionalVal is empty"+"\n"+Some(optionalVal).getOrElse("NA"));println(None.getOrElse("NA"))
    }
  }
}
