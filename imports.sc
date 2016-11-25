


  abstract class Fruit (val name:String,val color:String)

object Fruits {

  object apple extends Fruit("apple", "red")

  object orange extends Fruit("orange", "orange")

  object pear extends Fruit("pear", "greenishyellow")

  val menu = (apple, orange, pear)
}

  package object bobsdelights {
    def showFruit(fruit: Fruit) {
      import fruit._
      println(name +"s are "+ color)
    }
  }

  package printmenu {

    import bobsdelights.Fruits
    import bobsdelights.showFruit

    object PrintMenu {
      def main(args: Array[String]) {
        for (fruit <- Fruits.menu) {
          showFruit(fruit)
        }
      }
    }

  }











































