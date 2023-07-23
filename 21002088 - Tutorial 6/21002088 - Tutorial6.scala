package com.sanuth.scala

object demo21 extends App {
  def encryptEngine(word:String):String={
    var num:Int = 1
    var newWord:String=""
    word.foreach{char=>
      var temp = char.toInt + num
      num = num + 1
      newWord = newWord + temp.toChar.toString
    }
    newWord
  }

  def encrypt(str:String):String={
    var strArray:Array[String] = str.split(" ")
    var encString=""
    for(word <- strArray){
      var encWord:String = encryptEngine(word)
      encString = encString + " " + encWord
    }
    encString
  }

  def decryptEngine(word:String):String={
    var num:Int = 1
    var original:String=""
    word.foreach {char =>
      var temp = char.toInt - num
      num = num + 1
      original = original + temp.toChar.toString
    }
    original
  }

  def decrypt(str:String):String={
    var strArray:Array[String] = str.split(" ")
    var decString=""
    for(word <- strArray){
      var decWord:String = decryptEngine(word)
      decString = decString + " " + decWord
    }
    decString
  }

  def  Caesar_Cipher(str:String)={
    var encW:String = encrypt(str)
    println(s"Encrypted String : ${encW}")
    println(s"Decrypted String : ${decrypt(encW)}")
  }

  Caesar_Cipher("This String is Encrypted")


}
