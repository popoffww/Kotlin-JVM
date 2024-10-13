fun main() {
//  Мое решение
    var counter = 1

    val input1 = readln()

    while (true) {

        val input2 = readln()

        if (input2 == "Клиентов нет")
            break

        var price = input1.toInt() * input2.toInt()

        println(" - Клиент $counter. Стоимость: $price кредитов")

        counter++
    }

//  Изящное решение
    val tariffCost = readln().toInt()

    var clientNumber = 1

    while(true) {

        val inputData = readln()

        if(inputData == "Клиентов нет")
            break

        val clientHouseArea = inputData.toInt()
        val totalCost = clientHouseArea * tariffCost

        println(" - Клиент ${clientNumber}. Стоимость: ${totalCost} кредитов")

        clientNumber++
    }
}