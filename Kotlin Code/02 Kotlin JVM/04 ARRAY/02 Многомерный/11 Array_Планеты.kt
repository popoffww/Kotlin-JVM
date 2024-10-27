fun main() {
//  Переменная length не должна превышать длину массива - 10
    val length = readln().toInt()
    val planets = Array(10) {Array(6){""}}
    planets[0] = arrayOf("Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун")

    for (i in 0 until length) {
        val data = readln().split(",")
//      Почему нет кавычек?
        for (planet in planets[0].indices)
            if (planets[0][planet] == data[0]) {
                for (sputnik in 1 until planets.lastIndex) {
                    if (planets[sputnik][planet] == "") {
                        planets[sputnik][planet] = data[1]
                        break
                    }
                }
                break
            }
    }

    for (planet in planets[0].indices) {
        println("Планета \"${planets[0][planet]}\" имеет спутники:")
        var sputnikIs = false
        for (sputnik in 1 until planets.lastIndex) {
            if (planets[sputnik][planet] != "") {
                println("- ${planets[sputnik][planet]}")
                sputnikIs = true
            }
        }
        if (sputnikIs == false) println("- Данные не внесены")
    }
}