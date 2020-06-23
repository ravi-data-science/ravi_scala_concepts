object Group_Anagrams_Sol {

  val arr1 = Array("str","srt","abc","cba")
}
/*
import java.util

class Solution {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {


    //if (strs.length == 0) return new util.ArrayList[_]
    if (strs.length == 0) return util.ArrayList[_]
    var resultMap = Map[String,List]()
    for (s <- strs) {
      val charArry1 = s.toCharArray
      util.Arrays.sort(charArry1)
      val key = String.valueOf(charArry1)
      if (!resultMap.contains(key)) {
        resultMap += (key -> List())
        resultMap(key) = s
      }
    }
    new util.ArrayList[_](resultMap.mkString(""))
  }
}
*/
