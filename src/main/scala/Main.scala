
object Main extends App {
  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
  for (i <- 2 to 100 if isPrime(i)) println(i)
}

