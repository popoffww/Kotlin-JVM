fun main() {

    val month:Int = 11

    val season:String = when(month) {
        12, 1, 2 -> {
             "Winter"
        }
        in 3..5 -> {
            "Spring"
        }
        in 6..8 -> {
            "Summer"
        }
        in 9..11 -> {
            "Autumn"
        }
        else -> {
            "Wrong number of season"
        }

    }

    println(season)


    val gradus = 100

    val status = when {
        gradus < 0 -> "Ice"
        gradus < 100 -> "Liquid"
        else -> "Gaz"
    }

    println(status)

}