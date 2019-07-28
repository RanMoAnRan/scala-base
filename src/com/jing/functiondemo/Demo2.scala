package com.jing.functiondemo

/**
  * 柯里化
  */
object Demo2 extends App {
  def sum(num1: Int, num2: Int) = {
    num1 + num2
  }

  def sum2(num1: Int) = {
    (num2: Int) => num1 + num2
  }

  def sum3(num1: Int)(num2: Int) = num1 + num2


  println(sum(1, 2))
  println(sum2(10)(20))
  println(sum3(100)(200))
}
