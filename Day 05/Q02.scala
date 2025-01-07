object LibraryManagement {

    def main(args: Array[String]): Unit = {
        displayLibrary()
        addBook("Yuganthaya", "Martin Wickramasinghe", "B004")
        removeBook("B002")
        displayLibrary()
        searchByTitle("Hath Pana")
        displayBooksByAuthor("Martin Wickramasinghe")
    }

    case class Book(title: String, author: String, isbn: String)

    var library: Set[Book] = Set(
        Book("Gamperaliya", "Martin Wickramasinghe", "B001"),
        Book("Kaliyugaya", "Martin Wickramasinghe", "B002"),
        Book("Hath Pana", " Kumaratunga Munidasa", "B003")
    )

    def addBook(title: String, author: String, isbn: String): Unit = {
        val newBook = Book(title, author, isbn)
        library += newBook
        println(s"Book '${newBook.title}' added to the library.")
    }

    def removeBook(isbn: String): Unit = {
        println()
        library.find(_.isbn == isbn) match {
        case Some(bookToRemove) =>
            library -= bookToRemove
            println(s"Book '${bookToRemove.title}' removed from the library.")
        case None =>
            println(s"Book with ISBN '$isbn' not found in the library.")
        }
    }

    def containsBook(isbn: String): Boolean = {
        library.exists(_.isbn == isbn)
    }

    def displayLibrary(): Unit = {
        println()
        println("Current Library Collection:")
        library.foreach(book => println(s"${book.title} by ${book.author}, ISBN: ${book.isbn}"))
        println()
    }

    def searchByTitle(title: String): Unit = {
        library.find(_.title.equalsIgnoreCase(title)) match {
        case Some(bookFound) =>
            println(s"Book founded !")
            println(s"${bookFound.title} by ${bookFound.author}, ISBN: ${bookFound.isbn}")
        case None =>
            println(s"No book with title '$title' found in the library.")
        }
        println()
    }

    def displayBooksByAuthor(author: String): Unit = {
        val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
        if (booksByAuthor.nonEmpty) {
            println(s"Books by $author:")
            booksByAuthor.foreach(book => println(s"${book.title}, ISBN: ${book.isbn}"))
        } else {
            println(s"No books found by author '$author' in the library.")
        }
    }
}
