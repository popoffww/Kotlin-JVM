fun main() {
//    5
//    Вторник;Встреча с коллективом поваров
//    Понедельник;Встреча с королем
//    Понедельник;Встреча с делегатом
//    Среда;Встреча с сенаторами
//    Четверг;Встреча с поддаными

//    Понедельник:
//    - Встреча с делегатом
//    - Встреча с королем
//    Вторник:
//    - Встреча с коллективом поваров
//    Среда:
//    - Встреча с сенаторами
//    Четверг:
//    - Встреча с поддаными
//    Пятница:
//    - Встреч нет
    val range = readln().toInt()
    val meetArr = Array(range) { Array(2) {""} }

    for (i in meetArr.indices) {
        val data = readln().split(";")
        val days = data[0]
        val meet = data[1]

        meetArr[i][0] = days
        meetArr[i][1] = meet
    }

    for (i in meetArr.indices) {
        for (j in meetArr.indices) {
            if (meetArr[i][1] < meetArr[j][1]) {
                val meetSort = meetArr[i]
                meetArr[i] = meetArr[j]
                meetArr[j] = meetSort
            }
        }
    }

    val daysOfWeek = arrayOf("Понедельник", "Вторник", "Среда", "Четверг",
        "Пятница")

    for (day in daysOfWeek) {
        println("$day:")
//        var index = 0
        var meetIs = false
        for (i in meetArr.indices) {
            if (meetArr[i][0] == day) {
                println("- ${meetArr[i][1]}")
//                index++
                meetIs = true
            }
        }
        if (meetIs == false) println("- Встреч нет")
    }
}