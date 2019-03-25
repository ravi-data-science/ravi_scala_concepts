/**
  * Created by rkrovvidi on 3/24/19.
  */


class Brain private {
  override def toString = "This is the brain."
}

object Brain {
  val brain = new Brain
  def getInstance: Brain = {
    brain
  }
}

object Private_Constructor extends App {

  // this won't work
  // val brain = new Brain

  // this works
  val brain = Brain.getInstance
  println(brain)
}