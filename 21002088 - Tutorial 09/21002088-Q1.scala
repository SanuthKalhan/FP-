package com.sanuth.scala

object demoN30 extends App {
  class  Rational_Num(num1:Int, num2 :Int){
    var rash_num1 : Int = num1
    var rash_num2 : Int = num2
    var RashNum:String = s"${num1}/${num2}"

    def neg():Rational_Num = new Rational_Num(-num1,num2)
    override def toString:String = RashNum

  }

  val Rational_Num_list :List[Rational_Num] = List(
    new Rational_Num(1,2),
    new Rational_Num(3,4),
    new Rational_Num(6,7)
  )

  println(Rational_Num_list(0).neg())
}
