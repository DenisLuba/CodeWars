package dna

fun makeComplement(dna: String): String = dna.toList()
    .map {
        when (it) {
            'A' -> 'T'
            'T' -> 'A'
            'G' -> 'C'
            'C' -> 'G'
            else -> it
        }
    }.joinToString("")