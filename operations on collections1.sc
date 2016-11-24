import scala.collection.mutable.{ArrayBuffer, ListBuffer}

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

(List(1,2,3) ::: List(3,4,5)).distinct

val words = List("the", "quick", "brown", "fox")
 var a=words.map(_ .reverse.mkString)

def sum(xs:List[Int]):Int= (0 /: xs)(_ + _)

sum(List(1,2,3))

List.range(1 ,  5)
List.range(10,2,-2)
List.fill(2,2)("venky","srinivas")

List.tabulate (6 , 4)( _ * _)

List('a','b','c') sortWith(_ > _)

var r= List(1,2,4,3)
r sorted

val buf = new ListBuffer[Int]
buf += 1
2 +=: buf
buf .toList
val buff = new ArrayBuffer[Int]()

buff += 3
4 +=: buff

import scala.collection.mutable
val set = mutable.Set(1,2,3)
val words1 = Set("venky","Srinivas","Venky","srinivas")
val wo = mutable.Set.empty[String]
for(word <- words1)
  wo += word.toLowerCase
wo


def countWords(text: String) = {
  val counts = mutable.Map.empty[String, Int]
  for (rawWord <- text.split("[ ,!.]+")) {
    val word = rawWord.toLowerCase
    val oldCount =
      if (counts.contains(word)) counts(word)
      else 0
    counts += (word -> (oldCount + 1))
  }
  counts
}
countWords("See Spot run! Run, Spot. Run!")
import scala.collection.mutable
mutable.Map("hi" -> 2, "there" -> 5)




def longestWord(words: Array[String]) = {
  var word = words(0)
  var idx = 0
  for (i <- 1 until words.length)
    if (words(i).length > word.length) {
      word = words(i)
      idx = i
    }
  (word, idx)
}

longestWord("The quick brown fox".split(" "))














