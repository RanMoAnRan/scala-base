package com.jing.arraydemo

/**
  * 数组的定义及使用
  */
object Demo1 {
  def main(args: Array[String]): Unit = {

    //不可变数组
    var arr=new Array[Int](3)
    arr(0)=10
    arr(1)=20
    arr(2)=30
    println(arr(0))
    println(arr(1))
    println(arr(2))

    println("--------------")

    var arr2=Array("jing","ge","zui","shuai")
    println("数组长度："+arr2.length)
    println(arr2(0))
    println(arr2(1))
    println(arr2(2))

    println("------------")
    //遍历数组
    for (i<- arr2){
      println(i)
    }
  }
}
