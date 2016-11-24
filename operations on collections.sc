
List("venky","srinivas","krishna").map(_ .size)
List("venky","srinivas","krishna").map(_ .toUpperCase)
val x=List(1,2,3,4,5,6)
val evens=x.filter(_ %2==0)
x.filter(_ > 2)
val nums=List(23,44,34,78,33)
nums.filter(_ % 2==0)

nums.filter(_ % 2==0).sorted
nums.filter(_ % 2==0).max
nums.filter(_ % 2==0).min
(nums.filter(_ % 2==0).sum)

val avg=(nums.filter(_ % 2==0).sum)/nums.length

nums.filter( _ % 2 == 0).product
nums.filter(_ % 2 == 0).contains(33)
nums.filter(_ % 2==0).contains(44)
nums.filter(_ % 2==0).exists(_ < 50)

nums.map(_ + 2)
nums.map(_ * 2)

def filter(lst: List[Int], func: Int => Boolean) = {
  def loop(res: List[Int], ls: List[Int]): List[Int] = {
    ls match {
      case Nil => res
      case head :: tail => loop(if(isEven(head)) head :: res  else res, tail)
    }
  }
  loop(Nil, lst)
}

def isEven(x: Int) = x % 2 == 0

filter(1 to 6 toList, isEven)


def map(lt:List[String],fun:String =>  String )={
  def loop(res: List[String], ls: List[String]): List[String] = {
    ls match {
      case Nil => res

      case head :: tail => loop(fun(head) :: res ,tail)
    }
  }
  loop(Nil,lt)
}

//def reverse (str:String):String = {
 // str.reverse
//}
map(List("venky","srinivas"),s => s.reverse)














