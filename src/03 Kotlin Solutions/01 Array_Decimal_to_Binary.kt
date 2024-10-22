fun main() {

    var number = readln().toInt()
    var string = ""

    while (number > 0) {
        string += (number % 2).toString()
        number /= 2
    }
    println(string.reversed())
}