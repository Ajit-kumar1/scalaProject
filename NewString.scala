class NewString (first : String="" , last : String = ""){
println(first + " " + last)
}
object NewString extends App{
//def main(args : Array[String]):Unit= {
  val result = new NewString("hello ", "world")
  println(result)
//}
}