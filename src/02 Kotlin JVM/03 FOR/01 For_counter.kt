fun main() {
    val inputTransportCount = readln()
    val transportCount = inputTransportCount.toInt()

    var totalHarvest = 0

    for(transportNumber in 1 .. transportCount) {
        val deliveredHarvest = readln().toInt()

        totalHarvest += deliveredHarvest

    }

    println("Общий урожай: $totalHarvest тонн")
}