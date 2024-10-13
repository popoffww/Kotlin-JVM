fun main(){
    val number_of_guests = readln().toInt() // команда toInt() приводит значение String к Int
    val guests = Array<String>(number_of_guests) { "" } // создает массив, каждый из элементов является пустой строкой

    for(index in guests.indices) {
        guests[index] = readln() // заполняем массив данными
    }

    println("Гости:")
    for(index in guests.indices) {
        println("${index + 1}. ${guests[index]}")
    }
}