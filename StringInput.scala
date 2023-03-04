object StringInput {
  def main(args: Array[String]): Unit = {
    val name = scala.io.StdIn.readLine("What is your name")
    println("Your name is "+name)
  }

}
