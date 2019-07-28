package com.jing.classdemo

/**
  * Scala类的构造器
  */
class Dmeo1(val n: String, var a: Int) {
  //属性
  val name: String = n

  var age = a
  var sex: String = _ //_ 为占位符


  //构造器
  def this(n: String, a: Int, sex: String) {
    this(n, a) //第一行必须调用主构造器
    println("执行了辅助构造器")
  }

  def study(s: String): Unit = {
    println(name + "study" + s)
  }
}


object Demo1{
  def main(args: Array[String]): Unit = {
    var stu=new Dmeo1("靖哥",20) //主构造器
    println(stu.age)

    stu.study("scala")

    var stu1=new Dmeo1("靖哥",20,"男") //辅助构造器
    stu1.study("java")
  }
}
