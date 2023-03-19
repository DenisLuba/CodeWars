package middle

fun getMiddle(word: String) : String {
    val d = if (word.length % 2 == 0) word.length / 2 -1
    else word.length / 2
    return word.drop(d).dropLast(d)
}