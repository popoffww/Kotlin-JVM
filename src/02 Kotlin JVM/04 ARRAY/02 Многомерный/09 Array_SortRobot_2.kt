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
    val robotArr = Array(range) { Array(2) {""} }

    for (i in robotArr.indices) {
        val data = readln().split(";")
        val robotId = data[0]
        val time = data[1]

        robotArr[i][0] = robotId
        robotArr[i][1] = time
    }

    for (i in robotArr.indices) {
        for (j in robotArr.indices) {
            if (robotArr[i][0] < robotArr[j][0]) {
                val robotSort = robotArr[i]
                robotArr[i] = robotArr[j]
                robotArr[j] = robotSort
            }
        }
    }

    for (robot in robotArr) {
        println("График дроида \"${robot[0]}\":\n- ${robot[1]}")
    }
}