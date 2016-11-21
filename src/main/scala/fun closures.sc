import scala.collection.JavaConverters._

def sum(lst: List[Int]) = {
  def loop(res: Int, ls: List[Int]): Int = {
    ls match {
      case Nil => res
      case head :: tail => loop(res + head, tail)
    }
  }
  loop(0, lst)
}
sum(List(1,2,3))



def max(lt:List[Int]):Option[Int]= lt match {
  case Nil=> None
  case x:: Nil=>Some(x)
  case x::y::tail=>max((if(x>y) x else y)::tail)
}
max(List(2,5,7))


def max1(a:List[Int]):Int={
  max1[]= error
  max1[x]=x
  max1[x::y::xs]
}


