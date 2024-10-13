fun main() {

    val guests = readln().toInt()
    val day = readln()
    var food = 0

    when {
        day == "Понедельник" || day == "Пятница" ||
                day == "Суббота" || day == "Воскресенье" -> {
            when {
                guests < 10_000 -> food = 150_000
                guests in 10_000..50_000 -> food = 200_000
                guests > 50_000 -> food = 300_000
            }
        }
        day == "Вторник" -> {
            when {
                guests < 10_000 -> food = 125_000
                guests in 10_000..50_000 -> food = 175_000
                guests > 50_000 -> food = 275_000
            }
        }
        day == "Среда" -> {
            when {
                guests < 10_000 -> food = 100_000
                guests in 10_000..50_000 -> food = 150_000
                guests > 50_000 -> food = 250_000
            }
        }
        day == "Четверг" -> {
            when {
                guests < 10_000 -> food = 70_000
                guests in 10_000..50_000 -> food = 120_000
                guests > 50_000 -> food = 220_000
            }
        }
    }
    println(food)
}