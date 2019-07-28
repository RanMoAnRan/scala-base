package com.jing.classdemo

/**
  * scala类
  */
class Persion {
  //属性
  val id:String="abc"
  var age=30
  var name= "jing"

  //方法
  def sleep():Unit={
    println("睡觉zzz。。。")
  }
}


//名字相同则为伴生对象
object Persion{
  def main(args: Array[String]): Unit = {
    val p=new Persion
    println(p.id)

    p.age=20
    println(p.age)
    println(p.name)

    p.sleep()

  }
}
