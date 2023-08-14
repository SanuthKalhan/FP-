package com.sanuth.scala

object demoN28 extends App {
  val patternMatch: Int => Unit = (num: Int) => {
    val result = num match {
      case n if n<=0 => " Negative/Zero"
      case n if n%2==0 => "Even Number"
      case _ => "Odd Number"
    }
    println("Number is :" + result)
  }

  patternMatch(7)


}
