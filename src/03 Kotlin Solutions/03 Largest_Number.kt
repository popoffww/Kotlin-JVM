fun main() {

    val numbers: IntArray = intArrayOf(4, 9, 3, 2, 6)
    var largestElement = numbers[0]

    for (number in numbers){
        if(largestElement < number)
            largestElement = number
    }
    println("Наибольшее число в массиве: $largestElement")
}