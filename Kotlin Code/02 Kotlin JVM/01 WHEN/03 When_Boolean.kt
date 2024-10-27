fun main() {

    println("Ваше любимое блюдо:")
    val question_1 = readln()
    println("Как зовут вашу лучшую подругу:")
    val question_2 = readln()
    println("Какого цвета у вас глаза:")
    val question_3 = readln()

    var answer = false

    when {
        question_1 == "Яблоки" && question_2 == "Немфи"
                && question_3 == "Карие" -> answer = true
    }

    if (answer) {
        println("Доступ разрешен")
    } else {
        println("Доступ запрещён")
    }
}
