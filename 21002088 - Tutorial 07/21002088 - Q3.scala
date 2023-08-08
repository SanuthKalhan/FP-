package com.sanuth.scala

object demo26 extends App {
  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if (num <= 3) true
    else if (num % 2 == 0 || num % 3 == 0) false
    else {
      var i = 5
      while (i * i <= num) {
        if (num % i == 0 || num % (i + 2) == 0) return false
        i += 6
      }
      true
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val output = filterPrime(input)
  println(output)  

}
