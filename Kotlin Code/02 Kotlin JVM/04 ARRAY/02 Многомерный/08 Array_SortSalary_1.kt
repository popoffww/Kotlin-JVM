fun main() {
//    4
//    ММ-115541;350;450
//    ММ-114314;1000;1200
//    ММ-112224;450;500
//    ММ-111223;800;950
//    Отчет за прошедший месяц:

//    Инженер "ММ-114314":
//    - Повышение зарплаты на 200 кредитов
//    Инженер "ММ-111223":
//    - Повышение зарплаты на 150 кредитов
//    Инженер "ММ-115541":
//    - Повышение зарплаты на 100 кредитов
//    Инженер "ММ-112224":
//    - Повышение зарплаты на 50 кредитов

    val number = readln().toInt()
    val salaryArr = Array(number) {""}
    val salarySort = Array(number) {0}
    val ingenior = Array(number) {""}

    for (i in salaryArr.indices) {
        val inputData = readln().split(";")
        ingenior[i] = inputData[0]
        salarySort[i] = inputData[2].toInt() - inputData[1].toInt()
    }

    for (i in salarySort.indices) {
        for (j in salarySort.indices) {
            if (salarySort[i] > salarySort[j]) {
                val boost = salarySort[i]
                val ID = ingenior[i]
                salarySort[i] = salarySort[j]
                ingenior[i] = ingenior[j]
                salarySort[j] = boost
                ingenior[j] = ID
            }
        }
    }

    println("Отчет за прошедший месяц:\n")

    for (i in 0 until number) {
        println("Инженер \"${ingenior[i]}\":")
        println("- Повышение зарплаты на ${salarySort[i]} кредитов")
    }
}