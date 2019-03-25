/**
  * Created by rkrovvidi on 3/24/19.
  */
object ImmutableStack extends App{

  /*
  Immutable stacks are used rarely in Scala programs because their functionality is subsumed
  by lists: A push on an immutable stack is the same as a :: on a list and a pop on a stack is the same as a tail on a list.
   */

  val stack = scala.collection.immutable.Stack.empty
  val stk_1 = stack.push(1)
  val stk_2 = stk_1.push(2)

  println(stk_2.pop.top)
  println(stk_2.top)

}
