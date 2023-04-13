package count_the_number_of_duplicates

fun duplicateCount(text: String) = text
    .uppercase()
    .groupBy { it }
    .filterValues { it.size > 1 }
    .size
