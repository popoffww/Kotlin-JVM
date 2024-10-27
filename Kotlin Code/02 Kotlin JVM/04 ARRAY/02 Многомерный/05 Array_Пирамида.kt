fun main() {
//    Количество пирамид: 3
//    10x10x6;0.5
//    40x40x30;2.5
//    100x100x66;2.5
    val pyramidQuantity = readln().split(": ")[1].toInt()
    val inputData = Array(pyramidQuantity) {Array(2) {""} }
    val volumePyramid = Array(pyramidQuantity) {Array(3) {0} }

    for (i in inputData.indices) {
        inputData[i] = readln().split(";").toTypedArray()
//        val data = readln().split(";")
//        inputData[i][0] = data[0]
//        inputData[i][1] = data[1]
//        inputData[i][1].toFloat()

        val sideOfPyramid = inputData[i][0].split("x")
        volumePyramid[i][0] = sideOfPyramid[0].toInt()
        volumePyramid[i][1] = sideOfPyramid[1].toInt()
        volumePyramid[i][2] = sideOfPyramid[2].toInt()
    }

    println("Список ресурсов:")

    for (i in inputData.indices) {

        val volume = (volumePyramid[i][0] * volumePyramid[i][1] * volumePyramid[i][2]) / 3
        val blocks = (volume / inputData[i][1].toFloat()).toInt()

        println("- Пирамида #${i + 1}, $blocks блоков")
    }
}