package com.jing.demo

object OperatorDemo {
  def main(args: Array[String]): Unit = {
    val str1 ="abc"
    val str2=str1+""
    println(str1==str2)
    println(str1.eq(str2))
  }
}
