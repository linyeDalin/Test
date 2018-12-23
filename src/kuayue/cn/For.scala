package kuayue.cn

object For {

  def main(args: Array[String]): Unit = {
    var a = 0;
    // for 循环
    for (a <- 1 to 10) {
      // println("Value of a: " + a);
    }

    var b = 0;
    //  for 循环
    for (b <- 1 until 10) {
      // println("Value of a: " + b)
    }

    val c = 0
    val numlist = List(1, 2, 3, 5, 6)
    for (c <- numlist) {
      println(c)
    }
  }
}
