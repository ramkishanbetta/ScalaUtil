package com.betta.learning.scala.util

object Test {

  def main(args: Array[String]) = {
    val b = 1
    args(0) match {
      case "1" =>
      case a => print(a)
      case _ =>
    }
    val list = 0::1::2::4::6::3::Nil
    list match {
      case List(_, 1, 2, _*) => print("FOund")
    }

  }

}
