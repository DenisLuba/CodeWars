package maxlendiff

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
    if (a1.isEmpty() || a2.isEmpty()) return -1

    val arrLenA1 = a1.map { it.length }
    val arrLenA2 = a2.map { it.length }

    val maxA1 = arrLenA1.maxOrNull() ?: 0
    val maxA2 = arrLenA2.maxOrNull() ?: 0
    val minA1 = arrLenA1.minOrNull() ?: 0
    val minA2 = arrLenA2.minOrNull() ?: 0

    return (maxA1 - minA2).coerceAtLeast(maxA2 - minA1)
}
