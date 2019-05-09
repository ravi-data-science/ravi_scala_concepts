/**
  * Created by rkrovvidi on 5/2/19.
  */
object First_Recurring_Character {
  def main(args: Array[String]) {

    val charStr = "abca"
    val charArr = charStr.toCharArray


    var states = collection.mutable.Map[String, String]()
    states += ("AL" -> "Alabama")

    val mp_1 = collection.mutable.Map[String,Int]()
    //val hashMap = HashTable()
    for(chr <- charArr) {
      println("char::"+chr)


      if(mp_1.get(chr.toString) == None) {
        System.out.println("Being added to map::"+mp_1.get(chr.toString))
        mp_1 += (chr.toString -> 1)
      } else {
        System.out.println("repeated::"+chr+"::"+mp_1.get(chr.toString))
      }

    }

    //Empty HashMap = Map()


  }

}
