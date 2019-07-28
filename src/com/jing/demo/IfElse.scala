package com.jing.demo

/**
  * 条件表达式
  */
object IfElse {
  def main(args: Array[String]): Unit = {
    val num = 10
    val result = if (num > 1) 1 else -1
    println(result)

    println("--------------")

    val result2 = if (num > 1) 1 else "error"
    println(result2)
    println("--------------")

    val result3= if(num >2) 1 else ()
    println(result3)
    println("--------------")

    val result4=if(num>15) 1 else if(num==0) 0 else 10
    println(result4)
  }
}
