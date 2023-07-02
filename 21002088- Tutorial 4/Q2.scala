package com.sanuth.scala

object demo12 extends App {
  def patternMatch(num:Int)= num match {
    case n if n<=0 => " Negative/Zero"
    case n if n%2==0 => "Even Number"
    case _ => "Odd Number"
  }

  println(s"${patternMatch(5)}")

}
