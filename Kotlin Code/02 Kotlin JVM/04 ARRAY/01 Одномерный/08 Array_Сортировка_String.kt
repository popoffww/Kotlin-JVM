fun main(){
    val number_of_flights = readln().toInt() // команда toInt() приводит значение String к Int
    val destinations = Array<String>(number_of_flights) { "" } // создает массив, каждый из элементов является пустой строкой

    for(index in destinations.indices) {
        destinations[index] = readln()
    }

    for(i in destinations.indices) {
        for(j in destinations.indices) {
            if(destinations[i] < destinations[j]) {
                val tempDestination = destinations[i]
                destinations[i] = destinations[j]
                destinations[j] = tempDestination
            }
        }
    }

    for(destination in destinations) {
        println(destination)
    }
}