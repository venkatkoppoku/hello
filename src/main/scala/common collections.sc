1 :: 2 :: Nil
List(1,2) ::: List(2,3)
List(1,2) ++ Set(4,3)
List(1,2)== List(1,2)
List(1,2,3,2,4,2).distinct
List(6,2,3,4,5) drop 3
List(1,2,12,13,23,16) filter(_>10)
List(List(1,2),List(1,2,3)).flatten
List(1,2,3,4,4,5) partition(_<3)
List(1,2).reverse
List(1,2,3,4,2) slice (1,3)
List("apple", "to") sortBy (_.size)
List("apple", "to").sorted

List(2, 3, 5, 7) splitAt 2
List(2, 3, 5, 7, 11, 13) take 3
List(1, 2) zip List("a", "b")
val appended = List(1, 2, 3, 4) :+ 5
val suffix = appended takeRight 4
val middle =  appended dropRight  4
List(0, 1, 2) collect {case 0 =>
  "ok"}

List("milk,tea") map (_.toUpperCase)
List("milk,tea") flatMap  (_.toUpperCase)
List(41, 59, 26).max
List(10.9, 3, 4.23, 5).min
List(5, 6.0, 7).product
List(11.0, 23, 7).sum
List(4, 5, 6).fold(6)(_ + _)
List(4, 5, 6).foldLeft(-1)(_ + _)
List(4, 5, 6).foldRight(4)(_ + _)
List(4, 5, 6).reduce(_ + _)
List(3,2,1).reduceLeft(_ /_)
List(6, 3, 1).reduceRight(_ / _)
List(4, 5, 6).reduceRight(_ + _)
List(4, 5, 6).scan(0)(_ + _)
List(4, 5, 6).scanLeft(0)(_ + _)
List(4, 5, 6).scanRight(0)(_ + _)

val included = List(46, 19, 92).foldLeft(false) { (a, i) =>

  if (a) a else (i == 9)
   }

 List(24, 99, 104,99).mkString("  ")
List('f', 't').toBuffer
Map("a" -> 1, "b" -> 2).toList
Set(1 -> true, 3 -> true).toMap
List(2, 5, 5, 3, 2).toSet
List(2, 5, 5, 3, 2).toString



import collection.JavaConverters._
List(12, 29).asJava
new java.util.ArrayList(5).asScala

val statuses =List(500,404)
val msg= statuses.head match {
  case x if x>6 => "ok"
  case _ => "error"
}



val head = List(Nil,'g','b') match {

  case x :: xs => x

  case Nil => ' '
     }