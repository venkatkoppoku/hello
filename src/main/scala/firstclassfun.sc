def double(x:Int):Int= {x*2}
val myDouble=double _

myDouble(5)

def logStart()="=" * 50 + "\n StartNow\n" + "="*50
val start:()=>String=logStart
println(start())

def safeStringOp(s:String,f:String=>String)={
  if(s!=null) f(s) else s
}
def reverser(s:String)=s.reverse
safeStringOp("srinivas",reverser)



val maximize=(a:Int,b:Int)=>if(a>b) a else b
maximize(45,56)

val starts=()=>"=" * 50 + "\n StartNow\n" + "="*50
println(starts())

val doubler:Int=>Int=_ *2
doubler(6)