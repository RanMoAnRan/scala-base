package com.jing.fanxing

class Master

class Professional extends Master

class Card[+T](n: String)

object Metting{
  def meetspace(card:Card[Master])={
    println("大师")
  }

  def main(args: Array[String]): Unit = {
    var card=new Card[Professional]("张三")
    meetspace(card)
  }
}
