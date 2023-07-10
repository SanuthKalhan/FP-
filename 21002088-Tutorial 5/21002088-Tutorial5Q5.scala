package com.sanuth.scala

object demo20 extends App {
  def fibFunc(num1:Int,num2:Int,limit:Int):Int={
    if(limit>1){
      printf("%d, ",num2)
      fibFunc(num2,num1+num2,limit-1)
    }else{
      0
    }
  }
  def fibonacci(limit:Int)={
    printf("1, ")
    fibFunc(1,1,limit)
  }

  fibonacci(10)
}
