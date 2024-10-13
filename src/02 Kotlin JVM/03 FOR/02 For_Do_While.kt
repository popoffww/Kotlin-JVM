fun main() {
    var bookCount = 0
    do {
        println("Введите количество книг:")

        bookCount = readln().toInt()
    } while (bookCount == 0)

    println("Отсканированные книги:")

    for(bookNumber in 1 .. bookCount) {
        val bookName = readln()
        println("  - $bookName, ID-$bookNumber")
        println()
    }
}