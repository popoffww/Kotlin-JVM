fun main() {

    val temperatureOnWeek = arrayOf(
        arrayOf("Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"), // первая строка - названия столбцов
        arrayOf(10.5, 10.7, 5.7, 7.8, 4.1, 12.4, 17.4), // вторая и следующие - значения
        arrayOf(24.2, 25.2, 14.7, 24.8, 14.2, 24.2, 29.4),
        arrayOf(31.2, 29.7, 20.1, 31.1, 19.7, 33.3, 35.3)
    )

    for(dayIndex in temperatureOnWeek[0].indices) { // получаем диапазон индексов для первой строки
        println("Температура на ${temperatureOnWeek[0][dayIndex]} :")

        for(dataIndex in 1 .. temperatureOnWeek.lastIndex) { // печатаем все значения температуры на текущий день
//        for(dataIndex in temperatureOnWeek.indices) { // печатаем все значения температуры на текущий день
            println(temperatureOnWeek[dataIndex][dayIndex])
        }
    }


    val schedule = arrayOf(
        arrayOf("Понедельник", "Среда", "Пятница", "Суббота"),
        arrayOf("08:00-12:00", "08:00-12:00", "08:00-12:00", "12:00-15:00"),
        arrayOf("12:45-17:00", "12:45-17:00", "12:45-17:00", "16:00-18:00"),
    )

    for (column in schedule[0].indices) {
        for (row in schedule.indices) {
            print(schedule[row][column])

            if (row == 0) {
                print(": ")
            } else if (row < schedule.lastIndex)
                print(", ")
        }
        println()
    }
}