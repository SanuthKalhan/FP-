package com.sanuth.scala

object demo4 extends App {
  def salaryCal(whours:Int, OT:Int)= (whours*250 + OT*85)*4 -(whours*250 + OT*85)*4*0.12

  println(s"Rs.${salaryCal(40,30)}")

}
