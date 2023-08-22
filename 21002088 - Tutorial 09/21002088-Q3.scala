package com.sanuth.scala

object demoN33 extends App {
  class  Account(accN:Int,accB:Double){
    var accNum : Int = accN
    var accBalance : Double = accB

    def Deposit(amount:Double):Unit={
      this.accBalance=this.accBalance+amount
      println(s"Acc No: ${accNum} | prev balance : ${this.accBalance-amount} | Deposit : ${amount} | curr balance : ${this.accBalance}")
    }
    def Withdraw(amount:Double):Unit={
      if(amount<=this.accBalance){
        this.accBalance=this.accBalance-amount
        println(s"Acc No: ${accNum} | prev balance : ${this.accBalance+amount} | Withdraw : ${amount} | curr balance : ${this.accBalance}")
      }else{
        println("Insufficient Account Balance")
      }
    }
    def Transfer(amount:Double,accNo:Account):Unit={
      println(s"${this.accNum} >>> Transaction(${amount}) >>> ${accNo.accNum}")
      this.Withdraw(amount)
      accNo.Deposit(amount)
      println("Transaction Successfull!")
    }

    override def toString:String = s"Account Number : ${accNum} | Balance : ${accBalance}"

  }

  val Acc_Num_List :List[Account] = List(
    new Account(10001,10000),
    new Account(10002,20000),
    new Account(10003,40000),
  )

  Acc_Num_List.foreach(println)
  Acc_Num_List(0).Deposit(5000)
  Acc_Num_List(1).Withdraw(2000)
  Acc_Num_List(2).Transfer(3000,Acc_Num_List(1))

}
