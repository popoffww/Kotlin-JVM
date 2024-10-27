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
    val count = readln().toInt()
    val schedule = Array(13) { Array(5) { "" } }
    schedule[0] = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница")
    for (i in 0 until count) {
        val temp = readln().split(";")
        for (dayIndex in schedule[0].indices)
            if (schedule[0][dayIndex] == temp[0]) {
                for (dataIndex in 1..schedule.lastIndex) {
                    if (schedule[dataIndex][dayIndex] == "") {
                        schedule[dataIndex][dayIndex] = temp[1]
                        break
                    }
                }
                break
            }
    }
    for (dayIndex in schedule[0].indices) {
        println("${schedule[0][dayIndex]}:")
        var meetings = false
        for (dataIndex in 1..schedule.lastIndex){
            if(schedule[dataIndex][dayIndex] != ""){
                println("- ${schedule[dataIndex][dayIndex]}")
                meetings = true
            }
        }
        if (!meetings)
            println("- Встреч нет")
    }
}