package com.jing.collection

/**
  * 不可变map
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
    val map: Map[String, String] = Map("jing" -> "ge", "ya" -> "tou")
    println(map)
    val map2 = map.+("he" -> "hei")
    println(map2)

    var map3 = map - ("ya") //通过key删除

    //获取值
    val v: Option[String] = map.get("jing")
    println(v)

    //遍历一
    for (k <- map2.keys) {
      println("key:" + k + "--------value:" + map2.get(k))
    }
    //遍历方式二
    map2.keys.foreach { k =>
      println("key:" + k)
      println("value:" + map2.get(k))
    }
  }
}
