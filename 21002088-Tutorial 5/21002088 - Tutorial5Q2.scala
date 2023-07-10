package com.sanuth.scala

object demo16 extends App {
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

  def primeSeq(limit:Int,count:Int=2): Unit ={
    if(limit>count){
      if(isPrime(count)){
        printf("%d, ",count)
        primeSeq(limit,count=count+1)
      }else{
        primeSeq(limit,count=count+1)
      }
    }
  }

  primeSeq(10)
}
