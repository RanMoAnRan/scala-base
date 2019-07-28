package com.jing.implicitdemo

object Company {
  implicit var name: String = "小明"
  implicit var money: Double = 10000.00

}

class boss {
  def getname()(implicit name: String) = {
    name + "comming"
  }

  def getmoney()(implicit money: Double) = {
    "月薪" + money
  }
}

object boss{
  def main(args: Array[String]): Unit = {
    import Company._
    val boss = new boss
    println(boss.getname()+","+boss.getmoney())
  }
}