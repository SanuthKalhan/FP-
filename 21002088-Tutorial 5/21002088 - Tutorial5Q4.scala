package com.sanuth.scala

object demo18 extends App {
  def even(limit:Int,num:Int=0): Unit ={
    if(limit>=0){
      printf("%d, ",num)
      even(limit=limit-2,num=num+2)
    }
  }

  def odd(limit:Int,num:Int=1): Unit ={
    if(limit>=0){
      printf("%d, ",num)
      odd(limit=limit-2,num=num+2)
    }
  }
  even(10)
  println(" ")
  odd(9)
}
