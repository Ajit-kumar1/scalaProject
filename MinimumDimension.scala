// Program to check the dimensions of profile picture
object MinimumDimension {
  def checkDimension(length: Int, width: Int, height: Int): Int = {
    var flag = 0
    if (width < length || height < length) {
      flag = 1
    }
    else if (width > length || height > length) {
      flag = 2
    }
    return flag
  }

  def main(args: Array[String]): Unit = {
    try {
      print("Enter Length: ")
      val lengthOfPic = scala.io.StdIn.readInt()
      print("Enter Width: ")
      val widthOfPic = scala.io.StdIn.readInt()
      print("Enter Height: ")
      val heightofPic = scala.io.StdIn.readInt()
      val result = (checkDimension(lengthOfPic, widthOfPic, heightofPic))
      if (result == 0) {
        print("Accepted...")
      }
      else if (result == 1) {
        print("Upload another pic...")
      }
      else if (result == 2) {
        print("Crop it")
      }
    }
    catch {
      case e: NumberFormatException =>
        println("Exception Caught : Enter Number Only")
    }
  }
}
