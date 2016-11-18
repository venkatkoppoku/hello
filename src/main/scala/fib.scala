object fib extends App {
  def fib(n:Int)={
    var a=0
    var b=1
    var i=0
    if(i<n) {
      var c = a + b
      a = b
      b = c
      i = i + 1
    }
  }
  fib(4)
}