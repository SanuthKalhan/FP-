package com.sanuth.scala

object demoN29 extends App {
  val toUpper = (str:String)=>str.toUpperCase()
  val toLower = (str:String)=>str.toLowerCase()

  val funcForFirst = (str:String)=>str.toUpperCase()
  val funcForSec = (str:String)=>{
    str.substring(0,2).toUpperCase() + str.substring(2).toLowerCase()
  }
  val funcForThird = (str:String)=>str.toLowerCase()
  val funcForFourth = (str:String)=>{
    str.substring(0,1).toUpperCase()+str.substring(1,str.length()-1)+str.substring(str.length()-1).toUpperCase()
  }

  val formatNames = (name:String, formatFunc1:String => String) => {
    formatFunc1(name)
  }

  val names = List("Benny","Niroshan","Saman","Kumara")
  println(s"${formatNames(names(0),funcForFirst)}")
  println(s"${formatNames(names(1),funcForSec)}")
  println(s"${formatNames(names(2),funcForThird)}")
  println(s"${formatNames(names(3),funcForFourth)}")


}
