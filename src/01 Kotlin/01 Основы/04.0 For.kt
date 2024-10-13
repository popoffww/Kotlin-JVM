fun main() {

    for (i in 0..10) {
        println(i)
    }

    println("=====")


    for (i in 11 until 21) {
        println(i)
    }
    println("=====")

    for (i in 10 downTo 0) {
        println(i)
    }

    println("=====")
    

    val arr = arrayOfNulls<Int?>(10)

    for (i in 0 until arr.size) {
        arr[i] = i

    }

    for (i in arr) {
        println(i)
    }

}