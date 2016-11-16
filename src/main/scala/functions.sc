def add (x:Int,y:Int):Int= {x+y }
add(4,5)

def safeTrim(s:String):String={
  if(s==null) return null
  s.trim()
}
safeTrim(" srinivas")

def log(d:Double):Unit=println(f"got value $d%.2f")
log(2.7345)
def formatEuro(amt:Double)=f"$amt%.2f"
formatEuro{ val rate=2.345;4.34+5.67+rate*1.23}

def power(x:Int,n:Int,t:Int=1):Long={
  if(n< 0) t
  else power(x,(n-1),x*t)

}
power(3,4)


def sum(items:Int*):Int={
  var total=0
  for(i<-items) total += i
  total
}
sum(23,34,54,46)
def max(x:Int)(y:Int):Int=if(x>y) x else y
max(34)(45)

val s="vacation.jpg"
val is=s.endsWith(".jpg")

val d:Double=4.567
val c=d.compare(4.567)
var b=d.round
var e=d.floor
e.+(d)

def circle(r:String):String ={
    3.14*r*r
}
circle()