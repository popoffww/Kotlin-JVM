fun main() {

    val length = readln().toInt()
    val array = Array<Int>(length) {0}

//    for (i in array.indices) {
//        array[i] = readln().toInt()
//
//    }

//    for (i in 0 until array.size) {
    for (i in 0 until length) {
        array[i] = readln().toInt()
    }

    for (element in array.indices) {

        println("${array[element]} ")
    }
    for (element in array) {

        print("$element ")
    }
}