object countLetter{

    def main(args:Array[String]):Unit = {
        val words = List("apple", "banana", "cherry", "date")
        val total = countLetterOccurrences(words)
        println(s"$words")
        println(s"Total count of letter occurrences: $total")
    }

    def countLetterOccurrences(words: List[String]): Int = {
        val wordLengths = words.map(word => word.length)
        val totalLetters = wordLengths.reduce((a, b) => a + b)

        totalLetters
    }

}