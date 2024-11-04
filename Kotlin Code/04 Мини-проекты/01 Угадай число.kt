fun main() {

    val game = 1
    val guide = 2
    val exit = 3
    var isFirstStart = true

    while (true) {
        printMainMenu(isFirstStart)
        val selectedItemMenu = readItemMenu()
        when (selectedItemMenu) {
            game -> runGame()
            guide -> showGuide()
            exit -> exitGame()
        }
        isFirstStart = false
    }
}

fun printMainMenu(isFirstStart: Boolean) {
    println("1. Запустить игру")
    println("2. Гид по игре")
    println("3. Выйти из игры")
    println()
}

fun readItemMenu(): Int {
    val menuItems = arrayOf("1", "2", "3")

    while(true) {
        println("Выберите пункт:")
        val stepNumber = readln()
        if(stepNumber !in menuItems) {
            println("Некорректный номер пункта меню")
        } else {
            return stepNumber.toInt()
        }
    }
}

fun runGame() {
    println()
    println("Игра началась")

    val minRangeNumber = 0
    val maxRangeNumber = 100
    val winNumber = (minRangeNumber .. maxRangeNumber).random()
    var answer = ""
    while (answer != "Вы угадали число!") {

        println("Введите число от 1 до 100: ")
        val inputNumber = readln().toInt()

        when {
            inputNumber < 1 || inputNumber > 100 -> answer = "Число ${inputNumber} лежит за пределами заданного промежутка"
            inputNumber < winNumber -> answer = "Загаданное число больше"
            inputNumber > winNumber -> answer = "Загаданное число меньше"
            else -> answer = "Вы угадали число!"
        }
        println(answer)
    }
}

fun showGuide() {
    println()
    println("Открывается гид по игре")
    println()
    println("Вопрос: Какая цель игры?")
    println("Ответ: Целью игры является отгадывание числа, придуманного ИИ \"Алиса\", за минимальное число попыток.")
    println()

    println("Вопрос: Сколько дается попыток?")
    println("Ответ: Количество попыток вычисляет Алиса по собственной формуле, и она отказывается раскрывать ее.")
    println()

    println("Вопрос: Есть ограничение по времени?")
    println("Ответ: Алиса очень терпеливая, она будет ждать вашего ответа до тех пор,\nпока ее Создатель не забудет оплатить счет за аренду сервера.")
    println()
}

fun exitGame () {
    println("До свидания")
    System.exit(0)
}