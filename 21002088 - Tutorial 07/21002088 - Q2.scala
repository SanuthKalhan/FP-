package com.sanuth.scala

object demo25 extends App {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }

  val input = List(1, 2, 3, 4, 5)
  val output = calculateSquare(input)
  println(output)

}
