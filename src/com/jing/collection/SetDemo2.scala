package com.jing.collection

import scala.collection.mutable

/**
  * 可变set
  */
object SetDemo2 {
  def main(args: Array[String]): Unit = {
    val set = mutable.Set(3, 4, 5)
    set.add(6)
    set.+=(2)

    println(set)

    set.-=(2)
    println(set)

    val set2 = mutable.Set(5, 6, 7, 8)
    set ++= set2 //可变集合合并不会生成新的集合
    println(set)

  }
}
