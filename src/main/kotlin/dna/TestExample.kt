package dna

import org.junit.Assert.assertEquals
import org.junit.Test

class TestExample {

    @Test
    fun makeComplementTest() {
        assertEquals("TTTT", makeComplement("AAAA"))
        assertEquals("TAACG", makeComplement("ATTGC"))
    }
}