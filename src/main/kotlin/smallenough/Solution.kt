package smallenough

fun smallEnough(a : IntArray, limit : Int) : Boolean = (a.maxOrNull() ?: 0) <= limit