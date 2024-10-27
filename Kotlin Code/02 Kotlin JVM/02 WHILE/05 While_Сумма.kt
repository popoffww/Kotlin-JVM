fun main() {
    var foodBasketCost = 0
    do {
        val data = readln()
        if (data == "Продуктовая корзина пуста") {
            break
        } else {
            val itemPrice = data.toInt()
            foodBasketCost += itemPrice
        }
    } while (true)

    println(foodBasketCost)
}