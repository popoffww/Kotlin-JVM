fun main() {
//    В виду больших расстояний, преодолеваемых спорткарами на технологических
//    планетах, спорткарам требуется проходить техническое обслуживание (ТО)
//    каждые 100 000 километров
    val range = readln().toInt()

    val techControl = 100_000
    var total = 0

    for (i in 1..range) {
        val inputCarPass = readln().toInt()
        total += inputCarPass
    }
    if (total <= techControl) {
        println("До следующего ТО: ${techControl - total} км")
    } else {
        println("Срочно требуется провести ТО")
    }
}