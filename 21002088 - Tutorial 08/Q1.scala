package com.sanuth.scala

object demoN27 extends App {
  val IntCal: Double => Unit = (amount: Double) => {
    val interest = amount match {
      case x if x <= 20000 => (2 * x) / 100
      case x if x <= 200000 => (4 * x) / 100
      case x if x <= 2000000 => (3.5 * x) / 100
      case x => (3.5 * x) / 100
    }
    println("Interest :" + interest)
  }

  IntCal(35000)


}
