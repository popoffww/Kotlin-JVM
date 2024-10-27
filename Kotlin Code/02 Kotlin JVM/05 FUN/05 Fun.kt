val basketSize = 10
val basket = Array(basketSize) { Array(2) { "" } }

fun main() {
    do {
        val inputCommand = readln()

        when(inputCommand) {
            "Взять товар" -> {
                val inputProductData = readln()

                val productName = inputProductData.split(";")[0]
                val productCount = inputProductData.split(";")[1].toInt()

                if(productCount == 1)
                    putProduct(productName)
                else
                    putProduct(productName, productCount)
            }
            "Убрать товар" -> {
                val inputProductData = readln()

                val productName = inputProductData.split(";")[0]
                val productCount = inputProductData.split(";")[1].toInt()

                if(productCount == 1)
                    dropProduct(productName)
                else
                    dropProduct(productName, productCount)
            }
            "Озвучить товары в корзине" -> {
                announceBasketItems()
            }
        }
    } while(inputCommand != "Стоп")
}

fun announceBasketItems() {
    println("Товары в корзине:")
    for (item in basket) {
        if (item[0] != "")
            println(" - ${item[0]}, ${item[1]} шт")
    }
}

fun putProduct(product: String, count: Int = 1) {
    var currentProductSize = 0
    for (item in basket) {
        if (item[0] == product)
            currentProductSize += item[1].toInt()
        else
            break
    }

    if ((currentProductSize + count) > 5) {
        println("Превышено количество товара в корзине. Товар \"${product}\" не может быть добавлен.")
    } else {
        for (item in basket) {
            if (item[0] == product) {
                val currentCount = item[1].toInt()
                item[1] = (currentCount + count).toString()
                break
            } else if (item[0] == "") {
                item[0] = product
                item[1] = count.toString()
                break
            }
        }
    }
}

fun dropProduct(product: String, count: Int = 1) {
    var isFindProduct = false
    for (item in basket) {
        if (item[0] == product) {
            val currentCount = item[1].toInt()
            if ((currentCount - count) <= 0) {
                item[1] = ""
                item[0] = ""
            } else {
                item[1] = (currentCount - count).toString()
            }
            isFindProduct = true
            break
        }
    }

    if (!isFindProduct) {
        println("Товар \"${product}\" не найден в корзине, поэтому не может быть из нее убран.")
    }
}