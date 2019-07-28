package com.jing.methodDemo

object Demo3 {
  def main(args: Array[String]): Unit = {

    //后缀调用
    val max = Math.max(10, 20)
    println("最大值：" + max)

    //中缀调用
    val min = Math min(10, 20)
    println(min)

    //在scala中可以把操作符当成方法
    val a=1.+(2)
    println(a)

    //花括号调用，参数只有一个时可用
    val name=test{"靖哥"}
    println(name)

    //无括号调用
    hello


  }

  def test(name:String)={
    name
  }

  def hello()={
    println("hello")
  }
}
