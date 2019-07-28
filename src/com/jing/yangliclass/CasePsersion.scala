package com.jing.yangliclass

/**
  * 样例类
  * @param name
  * @param age
  */
case class CasePsersion(name: String, age: Int)

case class CaseStudent(var name: String, age: Int)

object CaseClassDemo{
  def main(args: Array[String]): Unit = {
    var per=new CasePsersion("张三",30)
    println(per)

    var stu=new CaseStudent("靖哥",20)
    println(stu)
    stu.name="丫头"
    println(stu)
  }
}