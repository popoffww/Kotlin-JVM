fun main(){
//Мое решение
    var counter = 0

    do {

        val name = readln()

        counter++

    } while (name != "Расчет окончен")

    println(counter - 1)

//    Мастер-решение
    var soldierCount = 0
    var soldierName = ""

    do {
        soldierName = readln()

        if(soldierName != "Расчет окончен") {
            ++soldierCount
        }
        else {
            break
        }
    } while (true)

    println(soldierCount)

//    var countSoldier = 0
//
//    while (readln() != "Расчет окончен")
//
//        countSoldier++
//
//    println(countSoldier)
}