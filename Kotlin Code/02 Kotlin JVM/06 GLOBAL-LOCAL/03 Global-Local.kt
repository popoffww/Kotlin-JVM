fun main() {
    do {
        val inputCommand = readln()

        when (inputCommand) {
            "Запуск" -> {
                turnOn()
            }

            "Отключение" -> {
                turnOff()
            }

            "Найти руду" -> {
                findOre()
            }
        }
    } while (inputCommand != "Отойти")
}

fun turnOn() {
    println("Бип-бип-би-БИИП")
}

fun turnOff() {
    println("Вжух-вжу-вж...")
}

fun findOre() {
    println("Руда не найдена")
}