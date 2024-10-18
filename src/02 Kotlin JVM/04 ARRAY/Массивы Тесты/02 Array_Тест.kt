fun main() {

//    val length1 = readln().toInt()
//    val array1 = Array<String>(length1) {""}
//
//    for (el in array1.indices) {
//        array1[el] = readln()
//    }
//
//    for (element in array1) {
//        println(element)
//    }

    val length2 = readln().toInt()
    val length3 = readln().toInt()
    val array2 = Array(length2) { Array(length3) {""}}

    for (el in array2.indices) {
//        array[el] = readln().split(" ").toTypedArray()
        val line = readln().split(" ")
//        array2[el][0] = line[0]
//        array2[el][1] = line[1]
        println(line)
    }

    for (column in array2.indices) {
        for (row in array2[column].indices) {
            println(array2[row][column])
        }
    }

    val monts = arrayOf(
        arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"),
        arrayOf("Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"),
    )

    for (i in monts[0].indices) {
        println("${monts[0][i]} месяц года:")
        for (j in 1..monts.lastIndex) {
            println(monts[j][i])
            println("-------------")

        }
    }
}