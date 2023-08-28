package com.sanuth.scala

object demoN34 extends App {
  val input: List[Double] = List(0,10,20,30)

  def calculateAverage(para:List[Double]):Unit={
    val inputsInCelcius: List[Double] = para.map{input=>
      (input * 9/5) + 32
    }
    val sum:Double = inputsInCelcius.reduce{(acc,temp)=>
      acc+temp
    }
    println(s"Average Fahrenheit temperature: ${sum/inputsInCelcius.length}")
  }

  calculateAverage(input)
}
