package area_or_perimeter

import org.junit.Assert.assertEquals
import org.junit.Test

class TestExample {
    @Test
    fun testAreaOrPerimeter() {
        assertEquals(32, areaOrPerimeter(6, 10))
        assertEquals(9, areaOrPerimeter(3, 3))
        assertEquals(16, areaOrPerimeter(4, 4))
    }
}