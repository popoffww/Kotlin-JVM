fun main() {
//    Гречка;1;Товар добавлен
//    Сало;2;Товар добавлен
//    Сало;1;Товар выложен
//    Покупатель идет на кассу
    println("Покупатель взял корзину:")

    var productCountInBasket = 0
    var maxProductInBasket = 5

    do{
        val inputData = readln()

        if(inputData == "Покупатель идет на кассу")
            break

        val productData = inputData.split(";")
        val productName = productData[0]
        val productCount = productData[1].toInt()
        val productStatus = productData[2]

        if(productStatus == "Товар добавлен"){
            toggleProduct(productName, productCount)
            productCountInBasket += productCount
        }
        else if(productStatus == "Товар выложен"){
            toggleProduct(productName, productCount, false)
            productCountInBasket -= productCount
        }
        else {
            break
        }
    } while(productCountInBasket <= maxProductInBasket)

    println("В корзине покупателя товаров: $productCountInBasket")
}

//    Покупатель взял корзину:
//    - Товар "Гречка" добавлен, 1 ед.
//    - Товар "Сало" добавлен, 2 ед.
//    - Товар "Сало" выложен, 1 ед.
//    В корзине покупателя товаров: 2

fun toggleProduct(name: String, count: Int, status: Boolean = true) {
    if(status){
        println("- Товар \"$name\" добавлен, $count ед.")
    } else {
        println("- Товар \"$name\" выложен, $count ед.")
    }
}