fun main() {

    var money: Int = 400

    var food:String = if (money >= 500) {
        "Пицца"
    } else if (money >= 300)  {
        money -= 100
        "Шаурма"
    } else {
        "Мы по пятницам не подаем"
    }

    println("Вы можете позволить себе купить: $food")
    println("У вас осталось $money рублей")

    val detail = readln()
    val percent = readln().toInt()

    if (detail == "Двигатель") {
        if (percent in 0..50) println("Деталь \"${detail}\": требуется замена")
        else if (percent in 51..75) println("Деталь \"${detail}\": требуется ремонт")
        else println("Деталь \"${detail}\": ремонт не требуется")
    } else if (detail == "Корпус") {
        if (percent in 0..25) println("Деталь \"${detail}\": требуется замена")
        else if (percent in 26..50) println("Деталь \"${detail}\": требуется ремонт")
        else println("Деталь \"${detail}\": ремонт не требуется")
    } else if (detail == "Бортовой компьютер") {
        if (percent == 0) println("Деталь \"${detail}\": требуется замена")
        else if (percent in 1..25) println("Деталь \"${detail}\": требуется ремонт")
        else println("Деталь \"${detail}\": ремонт не требуется")
    }


}