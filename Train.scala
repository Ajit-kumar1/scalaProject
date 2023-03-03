class Train (val message:String ,val number:Int){

}
object Train {
  def main(args: Array[String]): Unit = {
    //creating object of Train class
      var train = new Train("Hello , Ajit!",24)
    // calling message by object of Train class
      println(  train.message + " How are you" )
      println( s"${train.number}  is your lucky number" )
  }
}

