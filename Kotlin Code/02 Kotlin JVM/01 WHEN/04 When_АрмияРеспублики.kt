fun main() {
    //    Армия Республики
    val name = readln()

    var soldiers = 0
    var structure = ""
    var head = ""

    val squadSoldiers = 9
    val platoonSoldiers = squadSoldiers * 4
    val coySoldiers = platoonSoldiers * 4
    val battalionSoldiers = coySoldiers * 4
    val regimentSoldiers = battalionSoldiers * 4
    val legionSoldiers = regimentSoldiers * 4
    val greatArmySoldiers = legionSoldiers * 10

    when(name){
        "Великая армия Республики" -> {
            soldiers = greatArmySoldiers
            structure = "10 легионов"
            head = "Верховный Канцлер"
        }
        "Легион" -> {
            soldiers = legionSoldiers
            structure = "4 полка"
            head = "Клон-коммандер"
        }
        "Полк" -> {
            soldiers = regimentSoldiers
            structure = "4 батальона"
            head = "Клон-коммандер"
        }
        "Батальон" -> {
            soldiers = battalionSoldiers
            structure = "4 роты"
            head = "Клон-коммандер"
        }
        "Рота" -> {
            soldiers = coySoldiers
            structure = "4 взвода"
            head = "Клон-капитан"
        }
        "Взвод" -> {
            soldiers = platoonSoldiers
            structure = "4 отряда"
            head = "Клон-лейтенант"
        }
        "Отряд" -> {
            soldiers = squadSoldiers
            structure = "9 солдат"
            head = "Клон-сержант"
        }
        else -> {

        }
    }

    println("Количество солдат: $soldiers")
    println("Состав: $structure")
    println("Возглавляет: $head")
}