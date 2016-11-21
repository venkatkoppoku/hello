def h()={"this is string"}
h

 val x=1
val y=2
val z=4
x +
y +
z
val prog = 0XCAFEBABEL
val biggerStill = 123E45
val c= "\\n'"
println("""Welcome to Ultamix 3000.
Type "HELP" for help.""")
println("""|Welcome to Ultamix 3000.
          |Type "HELP" for help.""".stripMargin)
val s="hello,world"
s .indexOf ('o')

class rational(n:Int,d:Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n/g
  val denom: Int = d/g

  def this(n: Int) = this(n, 1)

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
val r=new rational(66,42)



