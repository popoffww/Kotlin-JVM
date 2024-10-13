fun main(){
//    Стоимость всей экипировки солдата, его боекомплекта и вооружения
//    Количество позиций: 4
//    Броня: 1500
//    Гранаты: 250
//    DC-15: 750
//    Боеприпасы: 150
    val firstLine = readln() // считываем первую строку
    val firstLineData = firstLine.split(": ") // с помощью команды split делим строку на части на основании условия, получая таким образом массив строк
    val count = firstLineData[1].toInt() // обращаемся ко второму элементу массива (строке) и приводим к типу Int
    val array = Array<Int>(count) { 0 } // создает массив, каждый элемент является числом 0

    var total = 0

    for(i in 0 until count) {
        val armour = readln().split(": ")
        val armourPrice = armour[1].toInt()
        array[i] = armourPrice
    }

    for (price in array) {
        total += price
    }

    println("На основании полученных данных затраты на снаряжение одного бойца составляют $total кредитов")
}