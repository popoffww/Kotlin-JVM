fun main() {
// Золотой Массив;Роберто Фламвель;211.3
// Золотой Массив;Роберто Фламвель;200.1
// Золотой Массив;Роберто Фламвель;247.4

    val carCount = readln().toInt() // считываем количество машин, участвующих в заезде
    val carDataList = Array(carCount) { Array(3) { "" } } // создаем массив, каждый элемент является массивом
    for (i in 0 until carCount) {
        val line = readln()
        val lineData = line.split(";") // разбиваем входную строку на 3 части
        carDataList[i][0] = lineData[0] // получаем модель спорткара
        carDataList[i][1] = lineData[1] // получаем ФИО водителя
        carDataList[i][2] = lineData[2] // получаем скорость спорткара

        println(lineData)
    }

// сортируем массив
    var carModel = "" // временная переменная для хранения модели машины
    var carDriver = "" // временная переменная для хранения водителя
    var carSpeed = "" // временная переменная для хранения скорости машины

    for (i in carDataList.indices) { // проверяем каждый элемент
        for (j in carDataList.indices) { // со всеми остальными
            if(carDataList[i][2].toDouble() < carDataList[j][2].toDouble()){ // если скорость текущей машины (А) меньше сравниваемой (B), меняем их местами

                carModel = carDataList[j][0] // сохраняем
                carDriver = carDataList[j][1] // во временные переменные
                carSpeed = carDataList[j][2] // данные по машине B

                carDataList[j][0] = carDataList[i][0] // на место машины B
                carDataList[j][1] = carDataList[i][1] // ставим
                carDataList[j][2] = carDataList[i][2] // машину A

                carDataList[i][0] = carModel // а на место машины A
                carDataList[i][1] = carDriver // ставим
                carDataList[i][2] = carSpeed  // машину B
            }
        }
    }

// выводим отсортированные данные на экран
    println("Результаты круга:")

    for (data in carDataList){
        println("Машина \"${data[0]}\", ${data[2]} км/ч")
    }

}