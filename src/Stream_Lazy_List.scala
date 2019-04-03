/**
  * Created by rkrovvidi on 4/3/19.
  */
object Stream_Lazy_List extends App{

  val streamLst = 100 #:: 200 #:: 85 #:: Stream.empty
  println(streamLst)

  println(streamLst.toList.toString)

}
