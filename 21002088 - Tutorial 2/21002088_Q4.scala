package com.sanuth.scala

object demo5 extends App {
  def profit(price:Int,att:Int)=att*price-(500+att*3)

  def priceAnalyse(price:Int,att:Int): Int = if(profit(price,att)<profit(price+5,att-20)) priceAnalyse(price+5,att-20) else price


  println(s"Price : ${priceAnalyse(5,160)}")
}
