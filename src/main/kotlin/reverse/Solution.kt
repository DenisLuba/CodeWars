package reverse

fun reverse(a: List<String>): List<String> {
    var string = a.joinToString("").reversed()

    return a.map {
            val res = string.take(it.length)
            string = string.drop(it.length)
            res
        }
}