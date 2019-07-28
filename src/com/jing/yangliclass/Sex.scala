package com.jing.yangliclass

trait Sex

case object male extends Sex

case object femal extends Sex

case class Persion(name:String,sex: Sex)

object CaseDemo{
  def main(args: Array[String]): Unit = {
    var p=new Persion("张三",male)
    println(p)
  }
}
