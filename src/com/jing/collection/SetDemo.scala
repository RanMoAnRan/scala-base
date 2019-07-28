package com.jing.collection

/**
  * 不可变set集合
  */
object SetDemo {
  def main(args: Array[String]): Unit = {
    val set = Set(3, 5, 4, 6, 8, 7, 3)
    println(set)
    val set2 = set + (1, 2)
    println(set2)

    val set3 = set - (1, 2)
    println(set3)

    //合并集合
    val set4 = Set(1, 2, 3, 4)
    val set5 = Set(4, 5, 6)
    println(set4 ++ set5)

    //集合交集
    val set6 = set4 & set5
    println(set6)

  }
}
