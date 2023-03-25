package reducebutgrow

fun grow(arr: IntArray) = arr.reduce { acc, i -> acc * i}