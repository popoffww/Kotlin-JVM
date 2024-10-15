fun main() {

    val planets = arrayOf(
        arrayOf("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"),
        arrayOf("Спутиков нет", "Спутиков нет", "1 спутник", "2 спутника", "93 спутника", "84 спутника", "52 спутника", "44 спутника", "32 спутника"),
    )

//    Первый вывод
    for (column in planets[0].indices) {
        for (row in planets.indices) {
            println(planets[row][column])
        }
    }

    println("===========")

//    Второй вывод
    for (planet in planets[0].indices) {
        println("Планета ${planets[0][planet]} имеет:")
        for (satellite in 1..planets.lastIndex) {
            println(planets[satellite][planet])
        }
    }
}