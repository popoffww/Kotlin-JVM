fun main() {
//    Анализ количества ресурсов (пища, вода, кислород) колонистов и
//    предупреждение при достижении критических значений
//    741;10;15;35
//    325;9;20;30
//    984;8;18;32
//    239;7;30;20
//    785;9;27;20
    val numberOfColonists = readln().toInt() // команда toInt() приводит значение String к Int
    val colonistsData =
        Array<String>(numberOfColonists) { "" } // создает массив, каждый из элементов является пустой строкой

    for (index in colonistsData.indices) {
        colonistsData[index] = readln() // считываем данные по колонистам
    }

    for (colonistData in colonistsData) {
        val data = colonistData.split(";")
        val colonistName = data[0].toInt() // имя колониста
        val amountOfFood = data[1].toInt() // количество еды
        val amountOfWater = data[2].toInt() // количество воды
        val amountOfAir = data[3].toInt() // количество воздуха

//        When отдельно
        when {
            amountOfFood < 10 -> println("Колонист ${colonistName}, у вас заканчивается провиант, пожалуйста, снизьте затраты")
        }
        when {
            amountOfWater < 25 -> println("Колонист ${colonistName}, у вас заканчивается вода, пожалуйста, снизьте нагрузку на организм")
        }
        when {
            amountOfAir < 30 -> println("Колонист ${colonistName}, у вас наблюдается перерасход кислорода, проконсультируйтесь с медицинским роботом")
        }

//        Или if отдельно, но не else if
//        if(amountOfFood < 10) {
//            println("Колонист $colonistName, у вас заканчивается провиант, пожалуйста, снизьте затраты")
//        }
//        if(amountOfWater < 25) {
//            println("Колонист $colonistName, у вас заканчивается вода, пожалуйста, снизьте нагрузку на организм")
//        }
//        if(amountOfAir < 30) {
//            println("Колонист $colonistName, у вас наблюдается перерасход кислорода, проконсультируйтесь с медицинским роботом")
//        }

        println()
    }
}