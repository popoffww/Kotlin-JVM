fun main() {
    var serviceName = readln()
    var price = 0
    var isUnknownService = false
    when(serviceName) {
        "Замена покрышек" -> price = 1000
        "Замена масла" -> price = 350
        "Замена тормозных колодок" -> price = 940
        "Обновление лакокрасочного покрытия" -> price = 4999
        else -> isUnknownService = true
    }

    if(isUnknownService)
        print("Услуга \"${serviceName}\" не предоставляется")
    else
        print("${serviceName} обойдется в $price кредитов")

}