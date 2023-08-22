package com.sanuth.scala

object demoN32 extends App {
  class  Rational_Num(num1:Int, num2 :Int){
    var rash_num1:Int=num1
    var rash_num2:Int=num2
    if (num1<0 && num2<0){
      rash_num1 = num1*(-1)
      rash_num2 = num2*(-1)
    }
    var RashNum:String = s"${num1}/${num2}"

    def sub(rash:Rational_Num):Rational_Num = {
      if(this.rash_num2==rash.rash_num2){
        new Rational_Num(this.rash_num1-rash.rash_num1,this.rash_num2)
      }else{
        new Rational_Num(this.rash_num1*rash.rash_num2-rash.rash_num1*this.rash_num2,this.rash_num2*rash.rash_num2)
      }
    }
    override def toString:String = RashNum

  }

  val Rational_Num_list :List[Rational_Num] = List(
    new Rational_Num(3,4),//x
    new Rational_Num(5,8),//y
    new Rational_Num(2,7)//z
  )

  println(s"x-y = ${Rational_Num_list(0).sub(Rational_Num_list(1))}")
  println(s"y-z = ${Rational_Num_list(1).sub(Rational_Num_list(2))}")


}
