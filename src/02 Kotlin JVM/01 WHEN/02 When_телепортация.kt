fun main() {
//Ученные с планеты Тетра разработали устройство "Infinity Mirror",
    // позволяющие телепортироваться в другие точки вселенной.
//Добавьте возможность телепортации между устройствами других разработчиков
//    Мое решение
    val deviceType_1 = readln()
    val deviceType_2 = readln()
    val destination_port = readln()

    when (deviceType_1) {
        "Infinity Mirror" -> {
            when (deviceType_2) {
                "Quantum Gateway" -> println("Телепортация на $destination_port разрешена")
                "Stargate" -> println("Телепортация на $destination_port разрешена")
                else -> println("Телепортация на $destination_port невозможна")
            }
        }
    }

//Мастер-решение
    val sourceDeviceType = readln()
    val destinationDeviceType = readln()
    val destination = readln()

    var isTeleportationPossible = false

    when (sourceDeviceType) {
        "Infinity Mirror" -> {
            when (destinationDeviceType) {
                "Infinity Mirror" -> isTeleportationPossible = true
                "Quantum Gateway" -> isTeleportationPossible = true
                "Stargate" -> isTeleportationPossible = true
            }
        }
        "Quantum Gateway" -> {
            when (destinationDeviceType) {
                "Infinity Mirror" -> isTeleportationPossible = true
                "Quantum Gateway" -> isTeleportationPossible = true
                "Stargate" -> isTeleportationPossible = true
            }
        }
        "Stargate" -> {
            when (destinationDeviceType) {
                "Infinity Mirror" -> isTeleportationPossible = true
                "Quantum Gateway" -> isTeleportationPossible = true
                "Stargate" -> isTeleportationPossible = true
            }
        }
    }

    if(isTeleportationPossible) {
        println("Телепортация на $destination разрешена")
    } else {
        println("Телепортация на $destination невозможна")
    }
}