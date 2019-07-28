package com.jing.functiondemo


object Demo1 {

  def main(args: Array[String]): Unit = {
    println(add(10, 20))

    //函数可以直接赋值给变量，方法不行
    val fun = add
    println(fun(1, 21))


    //方法转函数 加 _
    val fun1=calc _
  }


  //定义函数
  val add = (a: Int, b: Int) => {
    if (a > 0 && b > 0) {
      a + b
    }
  }

  //方法
  def calc(num: Int) = {
    num + 1
  }
}
