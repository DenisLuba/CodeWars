package logestconsec

fun longestConsec(strarr: Array<String>, k: Int) : String = if (k > 0) ( 0..strarr.size - k )
    .map { i -> strarr.toList().subList(i, i + k).joinToString("") }
    .maxByOrNull { it.length } ?: "" else ""


fun main() {
    val sequence = generateSequence(1) { it + 1 }
//    sequence.forEach(::println) бесконечная последовательность: 1, 2, 3, 4 ...
    val windows: Sequence<List<Int>> = sequence.windowed(size = 5, step = 2, partialWindows = false)
    println(windows.take(4).toList())
}