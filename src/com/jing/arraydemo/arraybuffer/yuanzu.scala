package com.jing.arraydemo.arraybuffer

/**
  * 元祖,可以存储多种数据类型
  */
object yuanzu {
  def main(args: Array[String]): Unit = {
    val d=("jing" ,1, "haha",3.14)
    println(d)

    var tuple=new Tuple3(1,2,"444")
    println(tuple)

    //取值
    println(tuple._1)
  }
}
