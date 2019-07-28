package com.jing.implicitdemo

case class Student(name: String) //学生

case class junren(name: String) //军人

case class SpecialPersion(name: String) //特殊人群


//隐式转换
object MyImplicit {
  implicit def teshuPersion(obj: Object): SpecialPersion = {
    obj match {
      case Student(name) => println(obj)
        new SpecialPersion(name)

      case junren(name) => println(obj)
        new SpecialPersion(name)
    }
  }
}

object Student {
  def main(args: Array[String]): Unit = {

    import MyImplicit._
    val student = new Student("张三")
    buyscokt(student)

    val junren = new junren("军人")
    buyscokt(junren)

  }

  def buyscokt(sp: SpecialPersion) = {
    println("特殊人群" + sp.name + "可以买半价票")
  }
}
