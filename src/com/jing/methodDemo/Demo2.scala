package com.jing.methodDemo

object Demo2 {
  def main(args: Array[String]): Unit = {
    defaultparm("靖哥")

    val result = add(b = 10)
    println(result)

    println("-------------")
    val res=add1(1,2,3,4,5)
    println(res)
  }


  //带默认值的方法
  def defaultparm(name: String, age: Int = 20) = {
    println(s"姓名=${name},年龄=${age}")
  }


  def add(a: Int = 0, b: Int = 0) = {
    a + b
  }


  //可变长度参数
  def add1(num: Int*) = {
    var result: Int = 0
    for (n <- num) {
      result = result + n
    }
    result
  }
}
