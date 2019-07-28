package com.jing.matchdemo

import scala.io.StdIn

object MatchDemo {
  def main(args: Array[String]): Unit = {
    println("请输入一个字符串")
    val name = StdIn.readLine()
    val result = name match {
      case "hadoop" => "大数据分布式存储和计算框架"
      case "java" => "一种编成语言"
      case "scala" => "scala语言"
      case _ => "没有此选项"
    }

    println(result)
  }
}
