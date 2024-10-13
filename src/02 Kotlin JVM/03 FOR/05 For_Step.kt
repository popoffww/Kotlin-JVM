fun main(){
//    На курортных планеты часто прилетают круизные лайнеры,
//    привозящие тысячи путешественников.
//    В то же время каждые два часа обслуживающие дроиды на лайнерах
//    выполняют десятки тысяч операций, например, готовят еду.
//    Напишите программу, считающую количество операций роботов
//    за определенный промежуток времени для выбранного ресторана
    val restaurant = readln()
    var period = readln().toInt()

    var totalRobotOperations = 0
    val startTime = 8

    for (time in (startTime until (startTime+period)) step 2) {
        when (time) {
            8, 16 -> {
                when (restaurant) {
                    "Голубая звезда" -> totalRobotOperations += 10_000
                    "Энерго" -> totalRobotOperations += 15_000
                    "Морские вкусности" -> totalRobotOperations += 7_000
                }
            }
            10 -> {
                when (restaurant) {
                    "Голубая звезда" -> totalRobotOperations += 23_000
                    "Энерго" -> totalRobotOperations += 10_000
                    "Морские вкусности" -> totalRobotOperations += 6_000
                }
            }
            12 -> {
                when (restaurant) {
                    "Голубая звезда" -> totalRobotOperations += 7_000
                    "Энерго" -> totalRobotOperations += 5_000
                    "Морские вкусности" -> totalRobotOperations += 2_000
                }
            }
            14 -> {
                when (restaurant) {
                    "Голубая звезда" -> totalRobotOperations += 1_000
                    "Энерго" -> totalRobotOperations += 1_000
                    "Морские вкусности" -> totalRobotOperations += 1_000
                }
            }
        }
    }
    println("$restaurant: $totalRobotOperations")
}