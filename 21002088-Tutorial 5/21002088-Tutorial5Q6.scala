package com.sanuth.scala

object demo19 extends App {
  def isEven(num:Int):Boolean={
    if(num%2==0){
      true
    }else{
      false
    }
  }
  def evenSum(n:Int,sum:Int=0): Int ={
    if(n>0){
      if(isEven(n)){
        evenSum(n-2,sum = sum + n-2)
      }else{
        evenSum(n-1,sum = sum + n-1)
      }
    }else{
      sum
    }
  }

  printf("%d",evenSum(8))
}
