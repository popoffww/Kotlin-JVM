fun main() {
//    Считается разность последовательности чисел, а между полученными результатами
//    выполняются следующие преобразования - четные строки перемножаются между собой,
//    нечетные складываются, а между ответами ставится знак "-"
//    Количество строк с данными: 4
//    10001-1970-3240-1102-1
//    39850-940-921-650-11
//    23645-8914-899-102-1
//    39561-8881-3221-9552-1
//    Разность: 3688 37328 13729 17906
//    Ответ: 17417-668395168
    val stringQuantity = readln().split(": ")[1].toInt()
    val inputData = Array(stringQuantity) { Array(5) {0}}
    val numbersArr = Array(4) {0}

    for (i in inputData.indices) {
        val numbers = readln().split("-")
        inputData[i][0] = numbers[0].toInt()
        inputData[i][1] = numbers[1].toInt()
        inputData[i][2] = numbers[2].toInt()
        inputData[i][3] = numbers[3].toInt()
        inputData[i][4] = numbers[4].toInt()
    }

    var index = 0
    for (i in inputData) {
        val number = i[0] - i[1] - i[2] - i[3]- i[4]
        numbersArr[index] = number
        index++
    }

    var odd = 0
    var even = 1
    for (i in numbersArr.indices) {
        if (i % 2 == 0) {
            odd += numbersArr[i]
        } else {
            even *= numbersArr[i]
        }
    }
    println("Ответ: $odd-$even")
}