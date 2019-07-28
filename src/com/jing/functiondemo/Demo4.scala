package com.jing.functiondemo

object Demo4 {
  def main(args: Array[String]): Unit = {
    val name = List("张三", "李四", "王五")
    val score = List(10, 20, 30)
    val score2 = List(10, 20, 30,50)
    val newlist = name.zip(score)
    println(newlist)

    val newlist2 = name.zipAll(score2,"haha",100)
    println(newlist2)

  }
}
