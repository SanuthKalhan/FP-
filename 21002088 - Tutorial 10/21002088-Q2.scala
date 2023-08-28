package com.sanuth.scala

object demoN35 extends App {
  val input:List[String] = List("apple", "banana", "cherry", "date")
  def countLetterOccurrences(input:List[String]):Unit={
    val wordLetterCountList:List[Int] = input.map{word=>
      word.length
    }
    val letCount:Int = wordLetterCountList.reduce{(acc,next)=>
      acc+next
    }
    println(s"Total count of letter occurrences: ${letCount}")
  }
  countLetterOccurrences(input)
}
