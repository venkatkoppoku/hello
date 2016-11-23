case class Money(rs:Double,ps:Double) {
  var rupee = rs
  var paisa = ps
   private def add(rupee:Double,paisa:Double):Double = rupee + paisa

  def add(that: Money): Money = new Money(
    rupee + that.rupee,  paisa + that.paisa )



}

val a=new Money(10.0,0.45)
val b =new Money(5.0,0.34)
a add b






