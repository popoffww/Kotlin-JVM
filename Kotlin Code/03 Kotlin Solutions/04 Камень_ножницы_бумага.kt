fun main() {
//  Код работает, только если разница индексов неотрицательная
    val options = arrayOf("камень", "ножницы", "бумага")
    val results = arrayOf("ничья", "Второй игрок", "Первый игрок")

    val firstPlayer = readln()
    val secondPlayer = readln()

    val case = options.indexOf(firstPlayer) - options.indexOf(secondPlayer)
    val winner = results[case]

    print(winner)
}