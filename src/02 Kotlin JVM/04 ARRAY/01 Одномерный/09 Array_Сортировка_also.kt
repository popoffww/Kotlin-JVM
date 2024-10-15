fun main(){
    val count = readln().toInt() // команда toInt() приводит значение String к Int
    val array = Array<Int>(count) { 0 } // создает массив, каждый из элементов является 0

    array.forEachIndexed { index, _ ->  array[index] = readln().toInt() }

    for (i in array.indices) {
        for (j in array.indices)
            if (array[i] < array[j])
                array[i] = array[j].also { array[j] = array[i] }
    }

    array.forEach { println(it) }
}