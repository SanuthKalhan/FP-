package com.sanuth.scala

object demo17 extends App {
  def sumFunc(num1:Int,num2:Int): Int ={
    if(num2==0){
      num1
    }else{
      sumFunc(num1+num2-1,num2-1)
    }
  }

  def sum(num:Int):Int=sumFunc(num,num)

  println(s"${sum(3)}")
}
