package com.sanuth.scala

object demo15 extends App {
  def check(num:Int,div:Int): Boolean ={
     if(div==2){
       true
     }else if(num%(div-1)==0){
       false
     }else{
       check(num,div-1)
     }
  }
  def isPrime(num:Int):Boolean=check(num,num)

  println(isPrime(19))

}
