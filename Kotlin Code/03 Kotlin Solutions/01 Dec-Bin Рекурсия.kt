fun main() {

    println("Введите число:")
    val number = readln().toInt()

    println("Число $number в двоичном представлении:")
    convertDecimalToBinary(number)
}

fun convertDecimalToBinary(number: Int) {
    val result = number % 2

    if (number >= 2)
        convertDecimalToBinary(number / 2)

    print(result)
}