fun main() {

    var monoRail = 0

    do {
        val direction = readln()

        if (direction == "Прямо") {
            monoRail += 1
        } else if (direction == "Вправо") {
            monoRail += 2
        } else if (direction == "Влево") {
            monoRail += 2
        } else if (direction == "Круговая") {
            monoRail += 3
        }

    } while (direction != "Стоп")

    println(monoRail)


    var weightCost = 0
    do {
        val data = readln()
        when (data) {
            "Прямо" -> weightCost += 1
            "Вправо", "Влево" -> weightCost += 2
            "Круговая" -> weightCost += 3
            "Стоп" -> break
        }
    } while (true)

    println(weightCost)
}