fun main() {

    println(sum_num(1, 2, 3, 4, 5))

}


fun sum_num(vararg numbers:Int):Int {

    var total = 0
    for (num in numbers) {

        total += num
    }

    return total

}