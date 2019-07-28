package com.jing.functiondemo

object WordCount {
  def main(args: Array[String]): Unit = {
    val list2 = List("hello world hello flume", "hello scala flink", "hadoop scala")
    val strings = list2.flatMap(x => x.split(" "))
      .groupBy(x => x)
      .map(el => (el._1, el._2.length))
      .toList
    println(strings)
  }
}
