fun main() {

    val time:Int = 22
    val weather:Boolean = false

    val todo:String = when {
        time in 12..18 && weather -> "Walk"
        time in 12..18 && !weather -> "Read book"
        else -> "Go to bed"
    }

    println(todo)

}