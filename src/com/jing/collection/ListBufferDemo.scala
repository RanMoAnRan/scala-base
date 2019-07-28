package com.jing.collection

import scala.collection.mutable.ListBuffer

object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    val list = ListBuffer[Int](1, 2, 3)
    println(list)

    val list1 = ListBuffer[Int]()
    list1 += 7
    println(list1)

    list1.append(9)
    println(list1)

    list1.insert(0, 1, 2)
    println(list1)

    list1(1) = 100
    println(list1)

    //删除
    list1 -= 1
    list1.remove(2)

    println(list1)

    val newlist = list ++ list1
    println(newlist)

  }
}
