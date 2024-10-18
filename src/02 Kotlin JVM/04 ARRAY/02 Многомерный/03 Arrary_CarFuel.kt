fun main() {
//    Мощность двигателя (л.с.): 2000
//    Объем бака с топливом (л.): 100
//    Количество замеров: 2
//    500;1
//    320;2
    val enginePower = readln().split(": ")[1].toInt()
    val fuelTankVolume = readln().split(": ")[1].toInt()
    val dataRows = readln().split(": ")[1].toInt()

    val dataList = Array(dataRows) { Array(2) { "" } }
    val statistics = Array(dataRows) { 0.0 }

    for (index in dataList.indices) {
        val data = readln().split(";")
        dataList[index][0] = data[0]
        dataList[index][1] = data[1]
    }

    var costs = 0.0
    for (index in dataList.indices) {

        val result = 0.3 * dataList[index][0].toInt() / enginePower * 100
        costs += result * dataList[index][0].toInt() / 100 * dataList[index][1].toInt()
        statistics[index] = result
    }

    println("Данные по расходу топлива:")
    for(index in statistics.indices) {
        println("${index+1}. ${statistics[index]} л на 100 км")
    }

    println()
    println("Осталось топлива в баке: ${fuelTankVolume - costs} литров")
}