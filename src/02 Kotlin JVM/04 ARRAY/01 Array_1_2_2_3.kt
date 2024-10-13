fun main() {

    val planets = arrayOf("Меркурий", "Венера", "Земля", "Марс")

    for(index in planets.indices) { // в качестве последовательности используется диапазон индексов массива
        if(index + 1 < planets.size) { // проверяем, что индекс следующего элемента существует
            println(planets[index] + " и " + planets[index + 1])
        }
    }
}