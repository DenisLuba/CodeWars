package string_to_number

import org.junit.Assert.assertEquals
import org.junit.Test


class TestExample {
    @Test
    fun sampleTest() {
        assertEquals(1234, stringToNumber("1234"))
        assertEquals(605, stringToNumber("605"))
        assertEquals(1405, stringToNumber("1405"))
        assertEquals(-7, stringToNumber("-7"))
    }
}