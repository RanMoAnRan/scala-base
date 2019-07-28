package com.jing.fordemo

/**
  * for推导式
  */
object Demo4 {
  def main(args: Array[String]): Unit = {
    var info=for (i<- 1 to 10) yield i*10

    println(info)
  }

}
