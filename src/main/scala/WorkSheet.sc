val res:String ="null"
res match {
  case s if s!=null=>println(s"received '$s' ")
  case s=>println("Error-received null responce")
}

val x:Int=125
val y:Any=x
y match {
  case x:String=>s" 'x'"
  case x:Double=>f" $x%.2f"
  case x:Int=>s"${x}"
}

for(x<- 1 to 7)  print (s"day$x:")
val threes = for(i<-1 to 20 if i%3==0) yield i


val name="venky,krishna,srinivas"
for {
  n <- name.split(",")
  if n != null
  if n.size > 0
}
  println(n)


for {
  x<- 1 to 2
  y<- 1 to 3
} print(s"($x,$y)")


val powersOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow


var a = 10; while (a > 0) { a -= 1
print(a) }


val str ="venky"
val st=str match {
  case s if s!=null=> println(s"$str")
  case s =>println("n/a")
}



val b:Double=0
b match {
  case same if b==0 =>print(s"same")
  case greater if b>0 =>print("more than zero")
  case lesser =>print("lessthan")

}


for(i<-1 to 100) {
  i match {
    case x if x%3==0 =>println(s"safe")
    case x if x%5==0  =>println(s"type")
    case x if x%15==0 => println(s"typesafe")
    case x => println(x)

  }
}


def add (x:Int,y:Int):Int= {x+y }
add(4,5)
