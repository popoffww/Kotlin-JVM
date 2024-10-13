fun main() {

    var formNumber = 0
    var userQuestionNumber = 0
    var userBalls = 0

    while (true) {

        val question = readln()

        if (question == "") {
            formNumber++

            val avgUserBalls = userBalls / userQuestionNumber
            if(avgUserBalls >= 4.75) {
                println("Анкета #${formNumber}: Годен")
            } else {
                println("Анкета #${formNumber}: Не годен")
            }

            userBalls = 0

            continue
        }
        if (question == "Анкеты закончились")
            break

        val answer = readln()



        when (question) {
            "Почему вы хотите стать шпионом?" -> {
                when (answer) {
                    "Патриотизм, желание служить планете" -> userBalls += 5
                    "Интерес к разведке и шпионажу" -> userBalls += 4
                    "Другое" -> userBalls += 3
                }
            }

            "Вы способны хранить секреты и работать в условиях неопределенности?" -> {
                when (answer) {
                    "Да, всегда" -> userBalls += 5
                    "Да, в большинстве случаев" -> userBalls += 4
                    "Нет, мне трудно хранить секреты" -> userBalls += 1
                }
            }

            "Вы умеете работать в команде и выполнять приказы" -> {
                when (answer) {
                    "Да, всегда" -> userBalls += 5
                    "Да, в большинстве случаев" -> userBalls += 4
                    "Нет, мне трудно работать в команде" -> userBalls += 1
                }
            }

            else -> {
                println("Вопрос не найден в банке данных")
                continue
            }
        }

        userQuestionNumber++
    }
}