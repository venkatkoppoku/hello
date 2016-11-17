def factorial(x:Int):Long={
  def fact(x:Int,a:Int=1):Long={
    if(x<1)  a
    fact(x-1,x*a)
  }
  fact(x,1)

}
factorial(4)