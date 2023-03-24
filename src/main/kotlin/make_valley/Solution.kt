package make_valley

import java.util.*

fun makeValley(array:IntArray):IntArray {

    array.sort()
    val result = mutableListOf<Int>()

    for (i in array.indices) {
        if (array.size % 2 == 0) {
            if (i % 2 == 0) result.add(array[i])
            else result.add(0, array[i])
        } else {
            if (i % 2 != 0) result.add(array[i])
            else result.add(0, array[i])
        }
    }

    return result.toIntArray()
}
