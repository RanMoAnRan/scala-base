package com.jing.fordemo

object Demo1 {
  def main(args: Array[String]): Unit = {
    for (i<- 1 to 10) print(i+"\t")

    println()
    println("--------------")


    //nutil 不包含最后一位数
    for(j <- 1 until 10){
      print(j+"\t")
    }

  }
}
