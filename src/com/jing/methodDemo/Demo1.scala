package com.jing.methodDemo

object Demo1 {
  def main(args: Array[String]): Unit = {

    println("靖哥")
    val re = add(10, 20)
    println(re)

    println("------------")

    val re1 = add1(100, 20)
    println(re1)
  }


  def method1(name: String): Unit = {
    println(name)
  }

  def add(a: Int, b: Int): Int = {
    val result = a + b
    return result
  }

  def add1(a: Int, b: Int) = {
    a + b
  }
}
