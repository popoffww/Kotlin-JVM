fun main() {
    do {
        val inputCommand = readln()

        when (inputCommand) {
            "Найти единомышленников" -> {
                println("Введите дистанцию забега:")
                val distance = readln().toInt()
                findFriends(distance)
            }
        }
    } while (inputCommand != "Завершить работу")
}

fun findFriends(distance: Int) {
    var likeMindedPeople = arrayOf(
        arrayOf("Черный Квадратный Квадрат", "12 км"),
        arrayOf("Большой Боб", "7 км"),
        arrayOf("Микки Мак Дак", "20 км")
    )

    var isFindUsers = false
    println("Единомышленники:")
    for(user in likeMindedPeople) {
        if(user[1].split(" ")[0].toInt() >= distance) {
            println(" - ${user[0]}")
            isFindUsers = true
        }
    }
    if(!isFindUsers) {
        println(" - Не найдены")
    }
}