fun main(){
    val gifts = arrayOf(1200, 1500, 100, 250, 890, 1236, 8650, 13365, 365, 198, 4563, 8960, 1250, 890, 360, 450, 986, 1565, 789, 365, 780)

    var sum = 0
    for(gift in gifts) {
        sum += gift
    }

    println(sum)
}