val pricePerTrip = 30

fun main() {
//    Оплатить свою поездку
//    Да
//    Выйти
    do {
        val inputCommand = readln()

        when(inputCommand) {
            "Оплатить свою поездку" -> {
                payForTrip()
            }
            "Оплатить чужую поездку" -> {
                println("Введите требуемое количество билетов:")
                val count = readln().toInt()
                payForTrip(numberOfTickets = count)
            }
        }
    } while(inputCommand != "Выйти")
}
//    С Вас 30 кредитов. Желаете оплатить? (Да/Нет)
//    Проезд оплачен. Удачного путешествия!

//    Введите требуемое количество билетов:
//    С Вас 150 кредитов. Желаете оплатить? (Да/Нет)
//    Проезд оплачен. Удачного путешествия!
fun payForTrip(numberOfTickets: Int = 1) {
    val price = numberOfTickets * pricePerTrip

    println("С Вас ${price} кредитов. Желаете оплатить? (Да/Нет)")
    val answer = readln()

    if(answer == "Да") {
        println("Проезд оплачен. Удачного путешествия!")
    } else {
        println("Проезд не оплачен. У Вас есть 30 секунд для повторения оплаты.")
    }
}