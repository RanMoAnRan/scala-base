package com.jing.fordemo

/**
  * 守卫
  */
object Demo3 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 100 if i % 10 == 0) {
      println(i)
    }


    println("-----------------")

    for (i <- 1 to 9; j <- 1 to 9 if (i >= j)) {
      print(i + "*" + j + "=" + (i * j) + "\t")
      if (i == j)
        println()
    }
  }
}
