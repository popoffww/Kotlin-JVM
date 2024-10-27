fun main() {
//    Количество солдат в группе: 4
//    Максимальных удаление: 10
//    TC-4505;5
//    TC-4404;10
//    TC-3202;12
//    TC-4101;8
    val soldiersQuantity = readln().split(": ")[1].toInt()
    val maxDistance = readln().split(": ")[1].toInt()
    val soldierList = Array(soldiersQuantity) { Array(2) { " " } }

//    for (i in 0 until soldiersQuantity) {
//        soldierList[i] = readln().split(";").toTypedArray()
//    }

    for (i in 0 until soldiersQuantity) {
        val inputData = readln().split(";")
        soldierList[i][0] = inputData[0]
        soldierList[i][1] = inputData[1]
    }

//    for (index in soldierList.indices) {
//        if (soldierList[index][1].toInt() == maxDistance) {
//            println("Солдат \"${soldierList[index][0]}\":\n - Находится на предельном удалении")
//        } else if ((soldierList[index][1].toInt() > maxDistance)) {
//            println("Солдат \"${soldierList[index][0]}\":\n - Находится вне установленной зоны")
//        }
//    }

    for (soldier in soldierList) {
        if (soldier[1].toInt() == maxDistance) {
            println("Солдат \"${soldier[0]}\":\n - Находится на предельном удалении")
        } else if ((soldier[1].toInt() > maxDistance)) {
            println("Солдат \"${soldier[0]}\":\n - Находится вне установленной зоны")
        }
    }
}