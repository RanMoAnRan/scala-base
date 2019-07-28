package com.jing.demo



object StringDemo {
  def main(args: Array[String]): Unit = {
    val name:String="hadoop"
    println(name+"------------"+name.length)



    /**
      * 插值表达式
      */
    val name1="zhangsan"
    var age=20
    val sex="男"
    var info =s"${name1},${age},${sex}"
    println(info)


    /**
      * 三引号语法
      */
    val sql:String=
      """select
        |*
        |from
        |table
        |where
        |id=4
      """.stripMargin

    println(sql)
  }

}
