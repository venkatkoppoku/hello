

case class Money(rupee: Int, paisa: Int) {
  def +(that: Money) = {
    Money(this.toDouble + that.toDouble)
  }

  def -(that: Money) = {
    Money(this.toDouble - that.toDouble)
  }
    def toDouble = if (this.paisa > 99) this.rupee + this.paisa / 100 + ((this.paisa % 100) / 100.0) else this.rupee + this.paisa / 100.0


  object Money {
    def apply(amount: Double): Money = {
      val totalPaisa = amount * 100
      new Money((totalPaisa / 100).toInt, (totalPaisa % 100).toInt)
    }
  }

}
val a= Money(12,46)
val b=Money(23,67)
a + b
