fun main() {
    do {
        val inputCommand = readln()

        when (inputCommand) {
            "Включить" -> {
                turnOnDroid()
            }

            "Выключить" -> {
                turnOffDroid()
            }

            "Назови свое имя" -> {
                speakDroidName()
            }
        }
    } while (inputCommand != "Отойти")
}

var isEnabled = false

fun turnOnDroid() {
    isEnabled = true
    println("Запуск систем дроида...")
}

fun turnOffDroid() {
    isEnabled = false
    println("Выключение систем дроида...")
}

fun speakDroidName() {
    if(!isEnabled)
        println("...")
    else
        println("Мое имя - HK-47")
}