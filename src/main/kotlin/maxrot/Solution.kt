package maxrot

fun maxRot(n: Long): Long = MutableList(n.toString().length) {}
    .runningFoldIndexed(n.toString()) { index, acc, string ->
        val chars = acc.toMutableList()
        chars.add(chars.removeAt(index))
        chars.joinToString("")
    }.map { it.toLong() }.maxOrNull() ?: 0
