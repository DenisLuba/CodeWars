package accum

fun accum(s: String): String = s
    .toList()
    .map { it.toString() }
    .foldIndexed("") { index, acc, char ->
        acc + char.uppercase() + char.lowercase().repeat(index) + "-" }
    .removeSuffix("-")


