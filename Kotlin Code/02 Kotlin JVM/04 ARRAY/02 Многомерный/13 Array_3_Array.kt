fun main() {
//    8
//    TK-12555;Радист
//    TK-17532;Медик
//    TK-84856;Боец
//    TK-81211;Боец
//    TK-81487;Радист
//    TK-71523;Медик
//    TK-74111;Боец
//    TK-84818;Боец
    // считываем количество солдат
    val numberOfSoldiers = readln().toInt()

    val numberOfGroups = numberOfSoldiers / 4
    // создаем 3мерный массив, где первая размерность будет обозначать количество групп
    // вторая - количество солдат в группе
    // третья - уникальный номер каждого солдата и его специализация
    val groupList = Array(numberOfGroups) { Array(4) { Array(2) { "" } } }

    for (i in groupList.indices) {
        for (j in groupList[i].indices) {
            val line = readln()
            val lineList = line.split(";")
            groupList[i][j][0] = lineList[0]
            groupList[i][j][1] = lineList[1]
        }
    }

    // сортируем сначала по специализациям в алфавитном порядке, а потом по ID
    for (i in groupList.indices) {
        for (j in groupList[i].indices) {
            for (k in groupList[i].indices) {
                if (groupList[i][j][1] < groupList[i][k][1] ||
                    (groupList[i][j][1] == groupList[i][k][1] && groupList[i][j][0] < groupList[i][k][0]))
                {
                    val temp = groupList[i][j]
                    groupList[i][j] = groupList[i][k]
                    groupList[i][k] = temp
                }
            }
        }
    }

    // печатаем информацию по группам
    for (i in groupList.indices) {
        println("Группа ${i + 1}:")
        for (j in groupList[i].indices) {
            println("- ${groupList[i][j][1]}, ${groupList[i][j][0]}")
        }
    }
}