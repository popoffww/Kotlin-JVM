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
    val engineerCount = readln().toInt()
    val engineers = Array(engineerCount) { Array(2) { "" } }

    for (index in 0 until engineerCount) {
        val data = readln().split(";")
        val engineerNumber = data[0]
        val lastEngineerSalary = data[1].toInt()
        val newEngineerSalary = data[2].toInt()
        val delta = newEngineerSalary - lastEngineerSalary

        engineers[index][0] = engineerNumber
        engineers[index][1] = "$delta"
    }

    for (i in engineers.indices) {
        for (j in engineers.indices) {
            if (engineers[i][1].toInt() > engineers[j][1].toInt()) {
                val tempEng = engineers[j]
                engineers[j] = engineers[i]
                engineers[i] = tempEng
            }
        }
    }

    println("Отчет за прошедший месяц:\n")
    for (engineer in engineers) {
        println("Инженер \"${engineer[0]}\":")
        println("- Повышение зарплаты на ${engineer[1]} кредитов")
    }
}