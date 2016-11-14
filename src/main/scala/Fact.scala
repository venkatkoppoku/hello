/**
  * Created by shiva on 14/11/16.
  */
  object  Fact extends App {

    def factorial(n: Int): Int = {
      def fact(n: Int, a: Int): Int = {
        if (n <= 0) a
        else fact(n - 1, n * a)

      }
      fact(n, 1)
    }

    (0 to 5) foreach (n => println(factorial(n)))
  }



