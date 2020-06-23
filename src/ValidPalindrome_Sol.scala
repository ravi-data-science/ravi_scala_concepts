
object ValidPalindrome_Sol extends App{

  val str1="malayalam"
  println(isPalindrome(str1))
  def isPalindrome(s: String): Boolean = {
    var i: Int = 0
    var j: Int = s.length - 1
    while ( {
      i < j
    }) {
      while ( {
        i < j && !(Character.isLetterOrDigit(s.charAt(i)))
      }) {
        i += 1
      }
      while ( {
        i < j && !(Character.isLetterOrDigit(s.charAt(j)))
      }) {
        j -= 1
      }
      if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
        return false
      }

      i += 1
      j -= 1
    }
    return true
  }
}
