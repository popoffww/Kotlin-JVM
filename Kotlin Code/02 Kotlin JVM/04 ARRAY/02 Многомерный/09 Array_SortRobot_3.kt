fun main() {
//    4
//    TC-4505;10:00-14:00
//    TC-4404;14:00-18:00
//    TC-3202;18:00-22:00
//    TC-4101;22:00-00:00
//    График дроида "TC-3202":
//    - 18:00-22:00
//    График дроида "TC-4101":
//    - 22:00-00:00
//    График дроида "TC-4404":
//    - 14:00-18:00
//    График дроида "TC-4505":
//    - 10:00-14:00
    val droidCount = readln().toInt() // считываем количество дроидов
    val droidWorkSchedule = Array(droidCount) { Array(2) { "" } } // создает массив, каждый элемент является массивом
    for (i in 0 until droidCount) {
        val line = readln()
        val lineData = line.split(";")
        droidWorkSchedule[i] = lineData.toTypedArray()
    }

    var droidName = ""
    var droidSchedule = ""
    for (i in droidWorkSchedule.indices) {
        for (j in droidWorkSchedule.indices) {
            if(droidWorkSchedule[i][0] < droidWorkSchedule[j][0]){
                droidName = droidWorkSchedule[j][0]
                droidSchedule = droidWorkSchedule[j][1]

                droidWorkSchedule[j][0] = droidWorkSchedule[i][0]
                droidWorkSchedule[j][1] = droidWorkSchedule[i][1]

                droidWorkSchedule[i][0] = droidName
                droidWorkSchedule[i][1] = droidSchedule
            }
        }
    }

    for (droidData in droidWorkSchedule){
        println("График дроида \"${droidData[0]}\":")
        println("- ${droidData[1]}")
    }
}