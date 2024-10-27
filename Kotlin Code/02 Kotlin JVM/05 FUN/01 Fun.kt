fun main() {
//    Успешно
//    Успешно
//    Ошибка
    println("Торжество начинается:")

    var currentStage = 1

    do{
        val stageStatus = readln()
        if(stageStatus == "Успешно")
            nextStage(currentStage)
        else if(stageStatus == "Ошибка")
            nextStage(currentStage, false)
        else {
            println("Неизвестный статус")
            break
        }
        currentStage++
    } while(currentStage <= 3)
}
//   Торжество начинается:
//   - Этап 1 успешно завершен
//   - Этап 2 успешно завершен
//   - Этап 3 невозможно завершить

fun nextStage(stage: Int, status: Boolean = true) {
    if(status){
        println("- Этап $stage успешно завершен")
    } else {
        println("- Этап $stage невозможно завершить")
    }
}