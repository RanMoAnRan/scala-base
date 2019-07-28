package com.jing.collection

/**
  * 不可变list
  */
object ListDemo {
  def main(args: Array[String]): Unit = {
    var list = List[Int](1, 2, 3)
    println(list)

    println(list.head)

    println(list.tail)

    val list1 = list :+ 1
    println(list1)

    val list2 = 1 :: list
    println(list2)

    val list3 = list.+:(2)
    println(list3)

    val list4 = list ++ list1
    println(list4)

    val list5 = list ++: list1
    println(list5)

    //删除
    val list6=list.drop(0)
  }
}
