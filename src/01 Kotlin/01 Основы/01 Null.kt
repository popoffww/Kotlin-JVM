fun main() {

    var a: String? = null
    var b: String? = "Kotlin and Java are best friends"
    var c: String? = ""

    var result = (a?.length?:0 ) + (b?.length?:0 ) + (c?.length?:0)

    println(result)


}