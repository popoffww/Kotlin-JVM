fun main() {

// Создаём двумерный массив
    var cinema = arrayOf<Array<Int>>()

// заполняем нулями
    for (i in 0..4) {
        var array = arrayOf<Int>()
        for (j in 0..4) {
            array += 0
        }
        cinema += array
    }

// выводим данные массива
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
}