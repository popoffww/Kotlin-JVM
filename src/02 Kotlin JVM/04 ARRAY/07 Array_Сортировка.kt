fun main() {
//От меньшего к большему
    val length = readln().toInt()
    val array = Array<Int>(length) {0}

    for (i in array.indices) {
        array[i] = readln().toInt()
    }

    for (i in array.indices) {
        for (j in array.indices) {
            if (array[i] < array[j]) {
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
    }

    println("От меньшего к большему:")
    for (element in array) {
        print("$element ")
    }

    println()

//От большего к меньшему
    for (i in array.indices) {
        for (j in array.indices) {
            if (array[i] > array[j]) {
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
    }

    println("От большего к меньшему:")
    for (element in array) {
        print("$element ")
    }
}