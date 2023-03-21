package convert_boolean_to_string

import org.junit.Assert.assertEquals
import org.junit.Test

class BoolToStrTest {
    @Test
    fun testTrue() {
        assertEquals("true", convert(true))
    }
    @Test
    fun testFalse() {
        assertEquals("false", convert(false))
    }
}