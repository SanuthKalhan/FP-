package com.sanuth.scala

object demo7 extends App {
  var newStr = " "

  def strRev(str:String){
    newStr = newStr + str(str.length-1)
    if(str.length-1>0){
      strRev(str.substring(0,str.length-1))
    }else{
      println(s"${newStr}")
    }
  }

  strRev("Name")

}
