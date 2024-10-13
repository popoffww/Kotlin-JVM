fun main() {

    val range = readln().toInt()

    val mushroomSoup = 50900
    val vegetables = 92500
    val salad = 130100
    var total = 0

    for (i in 1..range) {
        val inputString = readln()

        when (inputString) {
            "Грибной суп" -> total += mushroomSoup
            "Крем-суп из тыквы" -> total += vegetables
            "Винегрет" -> total += salad
        }
    }

    println("Количество калорий в блюдах: $total")
}