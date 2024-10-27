val systemPrivileges = arrayOf("Нет", "Чтение", "Добавление", "Удаление")
val users = arrayOf("ID_00101", "ID_32010")
val privilegesOfUsers = Array(users.size) { 0 }

fun main() {
    do {
        val inputCommand = readln()

        when (inputCommand) {
            "Назначить привилегии" -> {
                showRequestAccessUI()
            }

            "Отозвать привилегии" -> {
                showRemoveAccessUI()
            }

            "Проверить привилегии" -> {
                showAccessManagerUI()
            }
        }
    } while (inputCommand != "Закрыть программу")
}

fun showRequestAccessUI() {
    println("Введите ID работника:")
    val employeeId = readln()

    println("Введите привилегии (через запятую):")
    val employeePrivileges = readln().split(",")

    println("Сохранить привилегии? (Да/Нет)")
    val answer = readln()
    if (answer == "Да") {
        requestAccess(employeeId, employeePrivileges.toTypedArray())
        println()
    } else {

    }
}

fun showRemoveAccessUI() {
    println("Введите ID работника:")
    val employeeId = readln()

    println("Введите привилегии (через запятую):")
    val employeePrivileges = readln().split(",")

    println("Удалить привилегии? (Да/Нет)")
    val answer = readln()
    if (answer == "Да") {
        removeAccess(employeeId, employeePrivileges.toTypedArray())
        println()
    } else {

    }
}

fun showAccessManagerUI() {
    println("Введите ID работника:")
    val employeeId = readln()

    val userIndex = findUserIndex(employeeId)
    val employeePrivileges = privilegesOfUsers[userIndex]
    when (employeePrivileges) {
        0 -> println("Назначенные привилегии для ${employeeId}: Нет")
        2 -> println("Назначенные привилегии для ${employeeId}: Чтение")
        4 -> println("Назначенные привилегии для ${employeeId}: Добавление")
        6 -> println("Назначенные привилегии для ${employeeId}: Чтение, Добавление")
        8 -> println("Назначенные привилегии для ${employeeId}: Удаление")
        10 -> println("Назначенные привилегии для ${employeeId}: Чтение, Удаление")
        12 -> println("Назначенные привилегии для ${employeeId}: Добавление, Удаление")
        14 -> println("Назначенные привилегии для ${employeeId}: Чтение, Добавление, Удаление")
    }
}

fun findUserIndex(userId: String): Int {
    for (index in users.indices) {
        if (users[index] == userId)
            return index
    }
    return -1
}

fun findPrivilegeIndex(privilegeName: String): Int {
    for (index in systemPrivileges.indices) {
        if (systemPrivileges[index] == privilegeName)
            return index
    }
    return -1
}

fun requestAccess(employeeId: String, employeePrivileges: Array<String> = arrayOf("Нет")) {
    val userIndex = findUserIndex(employeeId)
    var privilegeNumber = 0
    for (privilege in employeePrivileges) {
        val privilegeIndex = findPrivilegeIndex(privilege)
        if (privilegeIndex != -1) {
            privilegeNumber += privilegeIndex * 2
        } else {

        }
    }
    privilegesOfUsers[userIndex] += privilegeNumber
}

fun removeAccess(employeeId: String, employeePrivileges: Array<String>) {
    val userIndex = findUserIndex(employeeId)
    var privilegeNumber = 0
    for (privilege in employeePrivileges) {
        val privilegeIndex = findPrivilegeIndex(privilege)
        if (privilegeIndex != -1) {
            privilegeNumber += privilegeIndex * 2
        } else {

        }
    }
    privilegesOfUsers[userIndex] -= privilegeNumber
}