fun main() {
//    Количество станций: 3
//    Норматив производства: 10000
//    А1;50000
//    А2;8000
//    А3;10000

//    А1;50000
//    А2;20000
//    А3;10000

//    А1;1000
//    А2;8000
//    А3;1000

    val stations = readln().split(": ")[1].toInt()
    val normative = readln().split(": ")[1].toInt()
    val inputData = Array(stations) {Array(2){""}}
    var totalVolume = 0


    for (i in inputData.indices) {
        val data = readln().split(";")
        inputData[i][0] = data[0]
        inputData[i][1]= data[1]
        totalVolume += inputData[i][1].toInt()
    }

    println("+------------------+")
    println("|  Отчет за месяц  |")
    println("+------------------+\n")
    println("* Совокупный объем продукции: $totalVolume")

    var benefit = "-"
    var penalty = "-"

    for (i in inputData.indices) {
        if (inputData[i][1].toInt() >= (normative * 2)) {
            if (benefit == "-") {
                benefit = inputData[i][0]
            } else {
                benefit += ", ${inputData[i][0]}"
            }

        } else if (inputData[i][1].toInt() < normative) {
            if (penalty == "-") {
                penalty = inputData[i][0]
            } else {
                penalty += ", ${inputData[i][0]}"
            }
        }
    }

    println("* Премия для станций: $benefit")
    println("* Штраф для станций: $penalty")
}