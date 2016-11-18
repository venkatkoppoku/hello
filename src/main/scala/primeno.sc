def prime(n:Int)={
  for(i <- 1 to n/2 ) {
    if(n%i==0) false
    else println(i)

  }
}
prime(7)