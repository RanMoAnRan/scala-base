package com.jing.functiondemo

object Demo3 {
  def main(args: Array[String]): Unit = {
    //遍历元素
    val list = List(1, 2, 3, 4, 5)
    list.foreach(x => print(x + "\t"))
    println()
    list.foreach(print(_))

    list.map(x => print(x + 1))

    println("-------------")
    val list2 = List("hello world hello flume", "hello scala flink")
    val result = list2.flatMap(x => x.split(" "))
    println(result)


    val result2 = list.filter(x =>
      if (x > 2) {
        true
      } else {
        false
      }
    )
    println(result2)


    //阶乘
    val result3 = list.reduce((x, y) => x * y)
    println(result3)

    //累加
    val result4 = list.reduceLeft((x, y) => x + y)
    println(result4)

    val max = list.reduceLeft((x, y) =>
      if (x > y) x
      else
        y
    )
    println("max:"+max)
  }
}
