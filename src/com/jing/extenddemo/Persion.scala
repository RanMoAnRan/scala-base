package com.jing.extenddemo

class Persion {
  var name: String = _
  var age: Int = _
}

class Student extends Persion {
  def study(cource: String) = {
    println(age + "岁的" + name + "在学习" + cource)
  }
}


object Student {
  def main(args: Array[String]): Unit = {
    val stu = new Student()
    stu.name = "靖哥"
    stu.age = 20
    stu.study("scala")
  }
}