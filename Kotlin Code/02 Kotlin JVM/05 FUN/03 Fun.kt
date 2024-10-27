fun main() {
//    Включить щит
//    Обновить настройки
//    75
//    Отойти от терминала
    do {
        val inputCommand = readln()

        when(inputCommand) {
            "Включить щит" -> {
                loadGoldSchield()
            }
            "Обновить настройки" -> {
                println("Введите мощность щита: ")
                val power = readln().toInt()
                loadGoldSchield(needToRefresh = true, power = power)
            }
        }
    } while(inputCommand != "Отойти от терминала")
}
//    Щит активирован. Мощность на 100%.
//    Введите мощность щита:
//    Щит перезагружается...
//    Щит активирован. Мощность на 75%.

fun loadGoldSchield(needToRefresh: Boolean = false, power: Int = 100) {
    if(needToRefresh) {
        println("Щит перезагружается...")
    }

    println("Щит активирован. Мощность на ${power}%.")
}