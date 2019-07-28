package com.jing.demo

object Demo1 {
  def main(args: Array[String]): Unit = {
    var name: String = "靖哥"
    var age: Int = 18
    println(name)
    println(age) //18
    age=25
    println(age) //25

    val ip="192.168.12.10"
    //ip="122"   val 定义的是常量不能修改值
    println("ip的值为："+ip)
  }

}
