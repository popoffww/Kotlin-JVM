fun main() {

    val arr = arrayOfNulls<Int?>(301)

//    for (i in 300 until arr.size) {
////        arr[i] = i
//    }

//    for ((index, i) in (300..600).withIndex()) {
   for ((index, i) in arr.withIndex()) {
        arr[index] = i
    }

    for (i in 600 downTo 300 step 5) {
        println(i)
    }



//    val arr2 = arrayOfNulls<Int?>(10)
//
//    for (i in 1 until arr.size) {
//        arr2[i] = i
//    }
//
//    for ((index, i) in arr.withIndex()) {
//        arr2[index] = i?.times(2)
//    }
//
//    for (i in arr2) {
//        println(i)
//    }

}