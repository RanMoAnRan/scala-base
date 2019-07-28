package com.jing.arraydemo.arraybuffer

import scala.collection.mutable.ArrayBuffer

/**
  * 可变数组操作
  */
object Demo1 {
  def main(args: Array[String]): Unit = {
    var arr=ArrayBuffer[Int]()
    //在数组末尾追加
    arr+=10
    //追加多个
    arr+=(20,30,40)
    println(arr)

    arr++=Array(40,50)
    arr++=ArrayBuffer(60,70)
    println(arr)


    arr.append(1000)

    arr.insert(0,1,2,3)
    println(arr)

    arr.remove(0)
    arr.remove(1,2)
    println(arr)
  }

}
