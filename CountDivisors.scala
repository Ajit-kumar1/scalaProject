//Program to count total divisors from two numbers by third number
object CountDivisors {
  //method isDivisor to count all divisor
  def isDivisor(first: Int, second: Int, divisor: Int):Int ={
    var count=0
    for(index<-first to second){
      if(index % divisor == 0){
        count = count+1
      }
    }
    return count
  }
def main(args: Array[String]): Unit={
  // Taking input from user
  print("Enter first number : ")
  val first = scala.io.StdIn.readInt()
  print("Enter first number : ")
  val second = scala.io.StdIn.readInt()
  print("Enter first number : ")
  val divisor = scala.io.StdIn.readInt()
  //Handling exception
  try{
    if(first>second) {
      throw new ArithmeticException()
    }
    else if(divisor ==0){
      throw new ArithmeticException()
    }
    else if(first < 0 || second < 0 || divisor < 0){
      throw new ArithmeticException()
    }
    else
      {
        val count=isDivisor(first, second, divisor)
        println(count)
      }
  }
  catch {
    case ex: ArithmeticException => {
      println("IO Exception, Enter valid inputs...")
    }
  }
}
}
