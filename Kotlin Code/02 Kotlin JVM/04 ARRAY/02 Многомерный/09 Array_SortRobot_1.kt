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
    val range = readln().toInt()
    val timeArr = Array(range) {""}
    val robotArr = Array(range) {""}

    for (i in timeArr.indices) {
        val data = readln().split(";")
        timeArr[i] = data[1]
        robotArr[i] = data[0]

//        println(robotArr[0])
//        println(timeArr[0])
    }

    for (i in robotArr.indices) {
        for (j in robotArr.indices) {
            if (robotArr[i] < robotArr[j]) {
                val robotId = robotArr[i]
                val time = timeArr[i]
                robotArr[i] = robotArr[j]
                timeArr[i] = timeArr[j]
                robotArr[j] = robotId
                timeArr[j] = time
            }
        }
    }

    for (i in 0 until range) {
        println("График дроида \"${robotArr[i]}\":")
        println("- ${timeArr[i]}")
    }
}