package com.sanuth.scala

object demo13 extends App {
  def toUpper(str:String)=str.toUpperCase()
  def toLower(str:String)=str.toLowerCase()

  def formatNames(name:String,formatFunc1:String=>String,formatFunc2:String=>String): Unit ={
    if(name.length()%2==0){
      println(s"${formatFunc1(name)}")
    }else{
      println(s"${formatFunc2(name)}")
    }
  }

  val names = List("Benny","Niroshan","Saman","Kumara")
  names.foreach(name => formatNames(name,toLower,toUpper))
}
