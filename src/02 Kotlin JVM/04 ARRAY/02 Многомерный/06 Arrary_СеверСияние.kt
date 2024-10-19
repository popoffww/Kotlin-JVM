fun main() {
//    Количество измерений: 3
//    Понедельник;05:15;12
//    Вторник;05:15;52
//    Вторник;00:00;98

    val measuresQuantity = readln().split(": ")[1].toInt()
    val inputData = Array(measuresQuantity) { Array(3) {""}}
    val days = arrayOf("Понедельник", "Вторник", "Среда", "Четверг",
        "Пятница", "Суббота", "Воскресенье")

    for (i in inputData.indices) {
        inputData[i] = readln().split(";").toTypedArray()
//        val data = readln().split(";")
//        inputData[i][0] = data[0]
//        inputData[i][1] = data[1]
//        inputData[i][2] = data[2]
    }

    println("=== График наблюдения северного сияния ===")
    println()

    for (day in days) {
        println("- $day:")
        var counter = 0
        for (i in inputData.indices) {
            if (inputData[i][0] == day && inputData[i][2].toInt() > 50) {
                println("  - Ожидается северное сияние после ${inputData[i][1]}")
                counter++
            }
        }
        if (counter == 0) println("  - Северного сияния не предвидится")
    }
}