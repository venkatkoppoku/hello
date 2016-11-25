42.toString
42.hashCode()
42 equals 42

def isEqual(x:Int,y:Int):Boolean = x == y
isEqual(12,11)

val x ="asdf".substring(2)
val y = "asdf".substring(3)
x == y

 def devide(x:Int,y:Int) =
   if(y != 0 ) x/y
else println("cannot devide with zero")

trait philosophical {
  def philosophize() {
    println("i consume memory, therefore i am")
  }
}


class animal
trait hashlegs
class Frog extends animal with philosophical with hashlegs {
  override def toString = "green"

  override def philosophize(): Unit = {
    println(" i am philosopher")

  }
}

val phrog:philosophical = new Frog
phrog.philosophize()














