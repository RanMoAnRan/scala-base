package com.jing.fordemo

/**
  * 嵌套循环
  */
object Demo {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      for (i <- 1 to 3) {
        print("*")
      }
      println()
    }


    println("----------------------")


    for (i <- 1.to(5); j <- 1 to 3) {
      print("*")
      if (i==3){
        println()
      }
    }
  }
}
