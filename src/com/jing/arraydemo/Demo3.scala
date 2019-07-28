package com.jing.arraydemo

object Demo3 {
  def main(args: Array[String]): Unit = {
    val arr = Array(11, 2, 3, 5, 8)
    println(arr.sum)

    println(arr.max)

    println(arr.min)

    //排序
    val sortarr = arr.sorted
    for (el <- sortarr) {
      print(el + "\t")
    }

    println()

    //原数组
    for (el <- arr) print(el + "\t")


    println()

    //从大到小排序
    val sortarr2 = arr.sortWith(_ > _)
    for (el <- sortarr2) print(el + "\t")

    println("---------------")

    println(arr.mkString("|"))
    println(arr.mkString("start","-","end"))
  }
}
