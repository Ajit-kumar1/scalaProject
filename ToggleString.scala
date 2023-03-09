import scala.io.StdIn

object ToggleString {
  //convert method is used to change upper to lower and lower to upper
  def convert(orgString: String): String = {
    var tempString: String = ""
    for (index <- 0 to orgString.length - 1) {
      if (orgString.charAt(index).toInt >= 65 && orgString.charAt(index).toInt <= 92) {
        tempString = tempString + ((orgString.charAt(index) + 32).toChar).toString
      }
      else if (orgString.charAt(index).toInt >= 97 && orgString.charAt(index).toInt <= 122) {
        tempString = tempString + ((orgString.charAt(index) - 32).toChar).toString
      }
    }

    return tempString


  }

  // Main method from where we are calling convert method
  def main(args: Array[String]): Unit = {
    // Checking for exception
    try {
      val input: String = StdIn.readLine("Enter your String : ")
      print(convert(input))
    }
    catch {
      case e: IllegalArgumentException =>
        println("Unknown Exception occured ")
    }
  }

}
