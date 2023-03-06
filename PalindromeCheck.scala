//Program to check give string is Palindrome or not
object PalindromeCheck {
  //function isPalindrome to check palindrome or not
  def isPalindrome(string : String ): Boolean ={
    val length = string.length
    for(index <- 0 until length/2){
      if(string(index)!= string(length-index-1)){
        return false
      }
    }
    return true
  }
  //defining main class
  def main(args : Array[String]): Unit = {
    //Taking input from user in inputString and pass it to method isPalindrome
    val inputString = scala.io.StdIn.readLine("Enter a string : ")
    if(isPalindrome(inputString)){
      println(s"$inputString is Palindrome")
    }
    else{
      println(s"$inputString is not Palindrome")
    }
  }

}
