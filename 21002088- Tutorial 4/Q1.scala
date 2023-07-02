package com.sanuth.scala

object demo11 extends App {
  def interest(depoAmount:Double): Double ={
    if(depoAmount<=20000){
      0.02*depoAmount
    }else if(depoAmount<=200000){
      0.04*depoAmount
    }else if(depoAmount<=2000000){
      0.035*depoAmount
    }else{
      0.065*depoAmount
    }
  }

  println(s"Interest : ${interest(300000)}")


}
