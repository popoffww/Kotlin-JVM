fun main() {

    var number = readln().toInt()
    var string = ""

    while (number > 0) {
        string += (number % 2).toString()
        number /= 2
    }
//  Первый вывод
    println(string.reversed())

//  Второй вывод
    val arr = arrayOf(string)
    arr.forEach { println(it.reversed()) }
}