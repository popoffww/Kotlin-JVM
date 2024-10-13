fun main() {
//    Первому гостю будет выдан чек на 1000 кредитов, а каждому следующему гостю
//    будет вручаться на 100 кредитов больше, чем предыдущему.
//    Напишите программу, которая будет считать общие затраты сенаторов
//    на такую пиар-компанию
    val guests = readln().toInt()

    var guestNumber = 0
    var guestPrize = 1000
    var cost = 0

    while(guestNumber < guests){
        cost += guestPrize
        guestPrize += 100
        guestNumber++
    }

    println(cost)


//    var guestsCount = readln().toInt()
//    var commonPrice = 0
//    var currentPrice = 1000
//  -- > 0 Что это?
//    while (guestsCount-- > 0) {
//        commonPrice += currentPrice
//        currentPrice += 100
//    }
//    println(commonPrice)
}