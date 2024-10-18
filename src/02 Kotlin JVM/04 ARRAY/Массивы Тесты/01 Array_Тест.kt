fun main() {
//  Варианты создания массива
    
    val number = readln().toInt()
    val salaryArr = Array(number) {""}
    val salarySort = Array(number) {0}
//    var index = 0
    val ingenior = Array(number) {""}

    for (i in salaryArr.indices) {
        val inputData = readln().split(";")
        val pastSalary = inputData[1].toInt()
        val currentSalary = inputData[2].toInt()
        val boostSalary = currentSalary - pastSalary

        ingenior[i] = inputData[0]
        salarySort[i] = inputData[2].toInt() - inputData[1].toInt()

//        salarySort[index] = boostSalary
//        index++
    }

    for (i in salarySort.indices) {
        for (j in salarySort.indices) {
            if (salarySort[i] > salarySort[j]) {
                val temp = salarySort[i]
                salarySort[i] = salarySort[j]
                salarySort[j] = temp
            }
        }
    }

    println("Отчет за прошедший месяц:\n")

        for (i in 0 until number) {
            println("Инженер \"${ingenior[i]}\":")
            println("- Повышение зарплаты на ${salarySort[i]} кредитов")
        }
}