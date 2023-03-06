class Time(val hours : Int , val minute : Int) {
}
object Time {
  def main(args: Array[String]): Unit = {
    val time = new Time(10, 10)
    println(time.minute)
    println(time.hours)

  }
}