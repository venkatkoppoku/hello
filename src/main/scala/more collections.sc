import scala.None

val m= Map("appl" -> 123,"msft" ->2345)
val n = m - "appl" +("goog"->345)
println(m)
println(n)

val nums= collection.mutable.Buffer(1)
for(i<- 2 to 10) nums += i
println(nums)
val num= collection.mutable.Buffer[Int]()
for(i<- 2 to 10) num += i
println(num)
val l =num.toList
println(num)
val k =num.toList
val s= Map("appl" -> 123,"msft" ->2345)
val r= s.toBuffer
r trimStart 1
r +=("goog"-> 345)
val g=r.toMap
val q= Set.newBuilder[Char]
q += 'h'
q ++= List('e','l','l','o')
val w= q.result
val col=Array("red","white","green")
col(0)="blue"
val files = new java.io.File(".").listFiles

val scala = files map (_.getName) filter(_ endsWith "scala")
val e=List(1,2,3,4)
val inks=Seq('c','r','b')

def inc(i:Int):Stream[Int]=Stream.cons(i,inc(i+1))
val u=inc(1)
val o=u.take(5).toList

val p=u.take(8).toList
val d=u.take(4).toList

u

def incr(head:Int):Stream[Int]= head #:: inc(head+1)
val f=inc(10).take(5).toList

def to(head:Char,end:Char):Stream[Char] = (head>end) match {
  case true =>Stream.empty
  case false=>head #:: to((head+1).toChar,end)
}
to('A','z').take(8).toList


var x:String="indeed"
var j=Option(x)
println(s"j isDefined? ${j.isEmpty}")

def devide(amt:Double,divisor:Double):Option[Double]= {
  if (divisor == 0) None
  else Option(amt/divisor)

}
devide(4,2)