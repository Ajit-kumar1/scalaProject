object UserInput {
  def main(args: Array[String]):Unit ={
    val (name, age , gender)= input()
    println(s"$name  $age $gender")
  }
  def input(): (String , Int, String)={
    val name = scala.io.StdIn.readLine("What is your name")
    print("What is your name")
    val age = scala.io.StdIn.readInt()

    val gender = scala.io.StdIn.readLine("What is your name")
    (name, age, gender)
  }
}
