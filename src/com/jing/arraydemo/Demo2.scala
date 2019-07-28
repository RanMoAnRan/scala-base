package com.jing.arraydemo

object Demo2 {
  def main(args: Array[String]): Unit = {
    var arr = Array(10, 20, 5, 13, 80, 55)
    var max = getmax(arr)
    println(max)
  }

  def getmax(arr: Array[Int]) = {
    var max = arr(0)
    for (i <- 1 until arr.length) {
      if (arr(i) > max) {
        max = arr(i)
      }
    }
    max //返回最大值
  }

}
