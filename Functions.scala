object Functions extends App{
  def aFunction(first: String , age: Int): String ={
    first+" "+age
  }
  def noArgumentFunction(): Int = 89
  println(aFunction("Rockey",32))
  println(noArgumentFunction())
  println(noArgumentFunction)
}
