object StringFilterer extends App {

def main(list: List[String]): List[String] = {
    list.filter(_.length >= 5)  
  }

  val originalList = List("my", "name", "is", "dasun", "tharinda", "athapaththu")
  val filteredList = main(originalList)

  println(s"Original List: $originalList")
  println(s"Filtered List (length > 5): $filteredList")
}

