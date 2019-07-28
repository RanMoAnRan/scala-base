package com.jing.traitdemo

trait TraitLogger {
  def log(msg: String) = {}
}

trait MyTrait extends TraitLogger {
  override def log(msg: String) = {
    println("log:" + msg)
  }
}

class Persion(name: String) extends TraitLogger {
  def say = {
    println("你好" + this.name)
    log(System.currentTimeMillis() + "")
  }
}

object Persion {
  def main(args: Array[String]): Unit = {
    var persion = new Persion("张三") with MyTrait
    persion.say
  }
}
