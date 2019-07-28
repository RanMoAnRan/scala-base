package com.jing.fanxing

class Persion {
  var name: String = _

  def chat(p: Persion) = {
    println(this.name + "和" + p.name + "一起聊天")
  }
}

class Student(stuname: String) extends Persion {
  this.name = stuname
}

class Teacher(traname: String) extends Persion {
  this.name = traname
}

class Strager(strname: String) {}

class Partty[T <: Persion] (p1:T,p2:T){
  def eat=p1.chat(p2)
}

object Partty{
  def main(args: Array[String]): Unit = {
    val stu=new Student("小米")
    val tea=new Teacher("小鬼")
    val str=new Strager("路人甲")
    val patty=new Partty(stu,tea)
    patty.eat
  }
}