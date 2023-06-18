package com.sanuth.scala

object demo5 extends App {
  def profit(price:Int,att:Int)=att*price-(500+att*3)

  def priceAnalyse(): Int ={
    var price = 5
    var attendance = 160
    var max = profit(price,attendance)
    price+=5
    attendance-=20
    while(max<profit(price,attendance)){
      max = profit(price,attendance)
      //println(max,price)
      price+=5
      attendance-=20
    }
    price-=5
    price
  }

  println(s"Price : ${priceAnalyse()}")
}
