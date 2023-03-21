package geometric_sequence_elements

fun geometricSequenceElements(a: Int, r: Int, n: Int) = (1 until n).runningFold(a) { acc: Int, i: Int -> acc * r}.joinToString(", ")


