package com.jing.collection

import scala.collection.mutable

/**
  * 可变map
  */
object MapDemo2 {
  def main(args: Array[String]): Unit = {
    val map1: mutable.Map[String, String] = mutable.Map()
    //添加元素的三种方式
    map1("baidu") = "www.baidu.com"
    map1.put("taobao", "www.taobao.com")
    map1.+=("jd" -> "www.jd.com")
    println(map1)

    println("-------------")
    //删除
    map1.remove("baidu")
    map1.-=("jd")
    println(map1)

  }
}
