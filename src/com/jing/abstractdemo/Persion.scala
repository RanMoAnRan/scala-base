package com.jing.abstractdemo

abstract class Persion {
  var name: String //抽象字段
  var age: Int = _ //非抽象字段

  //抽象方法
  def study(course: String)

  def say: String //如果不指定返回类型默认为Unit

  //非抽象方法
  def eat(food: String) = {
    println("吃" + food)
  }
}

class Student extends Persion {
  override var name: String = _

  override def study(course: String): Unit = {
    println(name + "学习" + course)
  }

  override def say: String = {
    "hello"
  }
}


object Student {
  def main(args: Array[String]): Unit = {
    var stu = new Student
    stu.name = "靖哥"
    stu.age = 20
    stu.study("scala")
    stu.say
    stu.eat("汉堡")

    var persion: Persion = stu
    persion.eat("大闸蟹")

    println(persion.isInstanceOf[Student])

    println(persion.getClass==classOf[Persion])
  }
}
