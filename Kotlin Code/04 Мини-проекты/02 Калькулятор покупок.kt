fun main() {
    printMainMenu()
//  readItemMenu()
    readItemMenu
    analyzeOrder()
    payOrder()
    cancelOrder()
}


fun printMainMenu() {
    println("""1. Посчитать стоимость продуктовой корзины
2. Оплатить покупку
3. Отменить покупку""")
    println()
}

//    fun readItemMenu(): String {
//        val menu = readln()
//        return menu
//    }
// Convert function readItemMenu to property
val readItemMenu: String
    get() {
        val menu = readln()
        return menu
    }

fun analyzeOrder() {
    println("Идет анализ продуктовой корзины")
    println()
    val goodsName = arrayOf("Макарошки", "Гречка", "Сало", "Пшено", "Рис", "Кусок металла")
    val goodsPrice = arrayOf(14, 69, 240, 31, 46, 10000)

    var name = ""
    var sum = 0

    var isError = false
    do {
        name = readln()

        if (name != "Продуктовая корзина пустая") {
            var isFind = false
            for (index in goodsName.indices) {
                if (goodsName[index] == name) {
                    isFind = true
                    break
                }
            }
            if(!isFind){
                isError = true
                println("Товар \"$name\" не найден в базе данных")
                break
            }
            for (index in goodsName.indices) {
                if (goodsName[index] == name) {
                    sum += goodsPrice[index]
                    break
                }
            }
        } else {
            break
        }
    } while (true)

    if(!isError) {
        println("Стоимость всех товаров в продуктовой корзине: $sum кредитов")
    }
}

fun payOrder() {
    println("Происходит процесс оплаты")
    println()
    println("Оплата прошла успешно")
}

fun cancelOrder() {
    println("Идет отмена покупки")
    println()
    println("Покупка отменена")
}