fun main() {

    val maxGuestCount = 2

    /*1*/  /*2*/      /*3*/       /*4*/
    val guests = Array<String>(maxGuestCount) { "" } // создаем массив (1), в котором можно хранить значения типа String (2). Размер массива определяет переменная maxGuestCount (3). Каждый элемент массива содержит пустую строку (4).

    var index = 0
    while (index < maxGuestCount) {
        val guestName = readln() // считываем имя гостя из консоли
        guests[index] = guestName // записываем в массив значение
        index++ // увеличиваем индекс для нового элемента
    }

    println("Список гостей:")
    for(guest in guests) {
        println(" - $guest")
    }

    val books = arrayOf("Книга 1", "Книга 2", "Книга 3")

    val currentBookId = readln().toInt()

    // проверяем границы диапазона массива
    if(currentBookId !in books.indices) {
        println("Некорректный ID книги")
        return // завершаем работу программы
    }

    // упрощенный вариант проверки
    if(currentBookId < 0 || currentBookId >= books.size) {
        println("Некорректный ID книги")
        return // завершаем работу программы
    }

    println("Текущая книга: ${books[currentBookId]}")
}