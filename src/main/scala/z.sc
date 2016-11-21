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



def max(a:List[Int]):Option[Int]= {
  a match {
    case Nil => None
    case x::Nil=>Some(x)
    case x::y::tail=> max((if(x> y) x else y)::tail)
  }
}



max(List(5,4,38))


def zipped(xs:List[Int],ys:List[Int]):List[(Int,Int)] = {
  (xs, ys) match {
    case (_, Nil) => List()
    case (Nil, _) => List()
    case (x :: xs1, y :: ys1)=>(x,y) :: zipped(xs1, ys1)
  }
}

def isort(xs: List[Int]): List[Int] = xs match {
  case List()
  => List()
  case x :: xs1 => insert(x, isort(xs1))
}
def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List()
  => List(x)
  case y :: ys => if (x <= y) x :: xs
  else y :: insert(x, ys)
}
isort(List(1,4,2))

