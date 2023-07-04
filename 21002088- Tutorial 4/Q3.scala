package com.sanuth.scala

object demo13 extends App {
  def toUpper(str:String)=str.toUpperCase()
  def toLower(str:String)=str.toLowerCase()
  def funcForFirst(str:String)=str.toUpperCase()
  def funcForSec(str:String)={
    str.substring(0,2).toUpperCase() + str.substring(2).toLowerCase()
  }
  def funcForThird(str:String)=str.toLowerCase()
  def funcForFourth(str:String)={
    str.substring(0,1).toUpperCase()+str.substring(1,str.length()-1)+str.substring(str.length()-1).toUpperCase()
  }

  def formatNames(name:String,formatFunc1:String=>String): String ={
    formatFunc1(name)
  }

  val names = List("Benny","Niroshan","Saman","Kumara")
  println(s"${formatNames(names(0),funcForFirst)}")
  println(s"${formatNames(names(1),funcForSec)}")
  println(s"${formatNames(names(2),funcForThird)}")
  println(s"${formatNames(names(3),funcForFourth)}")
}
