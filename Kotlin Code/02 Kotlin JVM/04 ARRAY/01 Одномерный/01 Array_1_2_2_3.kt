fun main() {

    val planets = arrayOf("Меркурий", "Венера", "Земля", "Марс")

    for(index in planets.indices) { // в качестве последовательности используется диапазон индексов массива
        if(index + 1 < planets.size) { // проверяем, что индекс следующего элемента существует
            println(planets[index] + " и " + planets[index + 1])
        }
    }


    val arraySize = readln().toInt()

    val arr = Array<String>(arraySize) {""}

    for (index in arr.indices) {
        arr[index] = readln()
    }

    for (index in arr.indices) {
        if (index + 1 < arr.size) {
            println(arr[index] + " - " + arr[index + 1])
        }
    }
}