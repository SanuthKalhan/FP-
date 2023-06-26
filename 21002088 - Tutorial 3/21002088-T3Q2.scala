package com.sanuth.scala

object demo8 extends App {
  val strList:List[String] = List("Sanuth","Vidath", "Manil","Isuka")
  var newList:List[String]= List()

  def listOpr(list:List[String]): Unit = for (str <- list) if (str.length > 5) newList = str :: newList

  listOpr(strList)
  println(s"${newList}")
}
