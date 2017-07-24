package com.myapp
object ImplicitDemo extends App{
import ComplexImplicits._

object ComplexImplicits{
	implicit def DoubleToComplex(value: Double) = new Complex(value, 0.0)
	implicit def Tuple2Complex(value:Tuple2[Double,Double]) = new Complex(value._1,value._2)
	
}

  val a:Int = 1
  val b:Int = 4
  val myRange = a to b
  myRange.foreach(println)

  val x:Complex = new Complex(5.0, 4.0)
  val y:Complex = new Complex(3.0, 2.0)

  println(5.0 + x)
  println(x)
  println(x + y)
  println(x - y )
  println(x + (1.0,1.0))

}

class Complex(val real:Double, val imag:Double)
{
  def +(that:Complex) = new Complex(this.real+that.real, this.imag+that.imag)
  def +(n:Double) = new Complex(this.real + n, this.imag)
  def -(that:Complex) = new Complex(this.real - that.real, this.imag - that.imag)
  override def toString = s"${real} + ${imag} i" 
}

