package com.jing.traitdemo

trait HandlerTrait {
  def handler(date: String) = {
    println("HandlerTrait:" + date)
  }
}

trait Handler1 extends HandlerTrait {
  override def handler(date: String) = {
    println("handlerone:" + date)
    super.handler(date)
  }
}


trait Handler2 extends HandlerTrait {
  override def handler(date: String) = {
    println("handlertwo:" + date)
    super.handler(date)
  }
}


class Perhandler(date:String) extends Handler1 with Handler2{
  def getpar={
    println("hhhhh")
    handler(this.date)

  }
}

object test{
  def main(args: Array[String]): Unit = {
    var p=new Perhandler("张三")
    p.getpar
  }
}