package com.jing.demo

/**
  * 块表达式
  */
object Block {
  def main(args: Array[String]): Unit = {
    var num1 = 10
    var num2 = 20
    var result = {
      var a = num1 + num2
      var b = num2 - num1
      //块表达式的返回值是最后一行语句
      num1
    }

    println(result)
  }
}
