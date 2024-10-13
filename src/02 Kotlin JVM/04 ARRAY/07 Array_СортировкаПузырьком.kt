fun main() {
//От меньшего к большему
    val length = readln().toInt()
    val array = Array<Int>(length) {0}

    for (i in array.indices) {
        array[i] = readln().toInt()
    }

    for (i in 1 until array.size) {
        for (j in array.size - 1 downTo i) {
            if (array[j] < array[j - 1]) {
                val temp = array[j]
                array[j] = array[j - 1]
                array[j - 1] = temp
            }
        }
    }

    println("От меньшего к большему:")
    for (element in array) {
        print("$element ")
    }

    println()

//От большего к меньшему
    for (i in 1 until array.size) {
        for (j in array.size - 1 downTo i) {
            if (array[j] > array[j - 1]) {
                val temp = array[j]
                array[j] = array[j - 1]
                array[j - 1] = temp
            }
        }
    }

    println("От большего к меньшему:")
    for (element in array) {
        print("$element ")
    }
}