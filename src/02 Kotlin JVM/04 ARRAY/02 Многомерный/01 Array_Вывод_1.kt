fun main() {

    val schedule1 = arrayOf(
        arrayOf("Пн", "08:00-12:00", "13:00-17:00"),
        arrayOf("Ср", "08:00-12:00", "13:00-17:00"),
        arrayOf("Пт", "08:00-12:00", "13:00-17:00"),
    )

    for(row in schedule1){
        for (item in row){
            println(item)
        }
    }

    println("===========")

    val planetsAndSatellites = arrayOf(
        arrayOf("Меркурий", "Спутиков нет"),
        arrayOf("Венера", "Спутников нет"),
        arrayOf("Земля", "1 спутник"),
        arrayOf("Марс", "2 спутника"),
        arrayOf("Юпитер", "62 спутника"),
        arrayOf("Сатурн", "54 спутника"),
        arrayOf("Уран", "27 спутников"),
        arrayOf("Нептун", "14 спутников"),
        arrayOf("Плутон", "5 спутников"),
    )

//    Первый вывод
    for(planetInformation in planetsAndSatellites){
        for (data in planetInformation){
            println(data)
        }
    }

    println("===========")

//    Второй вывод
    for(row in planetsAndSatellites.indices){
        for (column in planetsAndSatellites[row].indices){
            println(planetsAndSatellites[row][column])
        }
    }
}