

def gcd(n:Int,d:Int):Int= {
  var a = n
  var b = d
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}
gcd(8,12)

val filesHere = (new java.io.File(".")).listFiles
for (file <- filesHere)
  println(file)








try{
  val n:Int=5
  val half =
    if(n%2==0)
      n/2
  else

  throw new RuntimeException("n must be even")
}
catch {

  case ex:RuntimeException=>


}

import java.net.URL
import java.net.MalformedURLException
def urlFor(path: String) =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }
urlFor("https://web.skype.com/en/")

for(i<-1 to 10)
  {
    for(j<- 1 to 10)
      {
        i*j
      }

  }

