class NewString (first : String="" , last : String = ""){
println(first + " " + last)
}
object NewString{
def main(args : Array[String]):Unit= {
  val result = new NewString("hello ", "world")
  println(result)
}
}