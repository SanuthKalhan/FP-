package com.sanuth.scala

object demoN31 extends App {
  class Account(accN: Int, accB: Double) {
    var accNum: Int = accN
    var accBalance: Double = accB

    override def toString: String = s"Account Number : ${accNum} | Balance : ${accBalance}"
  }

  val Acc_Num_List: List[Account] = List(
    new Account(10001, 10000),
    new Account(10002, 20000),
    new Account(10003, 40000),
  )


  def neg(list:List[Account]): List[Account] ={
    var neg_list = list.map(acc=>new Account(acc.accNum,-acc.accBalance))
    neg_list
  }

  def sum(list:List[Account]):Double={
    var sum:Double = 0
    list.foreach(acc=> sum += acc.accBalance)
    sum
  }


  def final_balanace(list:List[Account],newlist:List[Account]): Double ={
    val updatedAccountList:List[Account] = list.map(acc => {
      if (acc.accBalance < 0) {
        new Account(acc.accNum, acc.accBalance - acc.accBalance * 0.1)
      } else {
        new Account(acc.accNum, acc.accBalance - acc.accBalance * 0.05)
      }
    })

    var Sum = sum(updatedAccountList)
    Sum
  }

  var neg_balance_list:List[Account]=neg(Acc_Num_List)
  neg_balance_list.foreach(println)
  println("\n")
  println(s"TotalBalance : ${sum(Acc_Num_List)}")

  var new_list = neg_balance_list ++ Acc_Num_List
  var final_Acc_list:List[Account] =List()
  println(s"Final Account Balance : ${final_balanace(new_list,final_Acc_list)}")
  
}
