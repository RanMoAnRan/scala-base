package com.jing.functiondemo

/**
  * 匿名函数
  */
object FunctionDemo {
  def main(args: Array[String]): Unit = {
    val hello = (name: String) => println(name)
    hello("jing")

    sayhello(goodmorring, "靖哥")

    var goo = goodnight _
    sayhello(goo, "丫头")

    val test1=test("hello")
    test1("绽放三")

  }

  def goodmorring(name: String) = {
    println("早上好" + name)
  }

  def goodnight(name: String) = {
    println("晚上好" + name)
  }

  def sayhello(fun: (String) => Unit, name: String): Unit = {
    fun(name)
  }

  //高阶函数
  def test(hello:String)={
    (name:String)=> println(hello+","+name)  //返回匿名函数
  }
}
