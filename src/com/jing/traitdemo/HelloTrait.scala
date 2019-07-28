package com.jing.traitdemo

trait HelloTrait {
  def sayhello(s: String)

  def eat(food: String) = {
    println(food)
  }

  var name: String

  var age: Int = _
}

trait One {
  def hello: String
}

trait Two {
  def eat(s: String)
}

class Child extends HelloTrait with One with Two {
  override def sayhello(s: String): Unit = {
    println(s)
  }

  override def hello: String = "hahha"

  override def eat(s: String): Unit = {
    println(s + hello)
  }

  override var name: String = _
}

object Test {
  def main(args: Array[String]): Unit = {
    val c = new Child()
    c.sayhello("hello")
    c.eat("吃大餐")
  }
}