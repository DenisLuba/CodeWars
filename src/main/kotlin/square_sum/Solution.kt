package square_sum

fun squareSum(n: Array<Int>) = n.fold(0) { acc, i -> acc + i * i }
