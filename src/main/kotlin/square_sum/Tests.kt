package square_sum

import org.junit.Assert.assertEquals
import org.junit.Test

class Tests {

    @Test
    fun squareSumTest() {
        assertEquals(5, squareSum(arrayOf(1, 2)))
        assertEquals(50, squareSum(arrayOf(0, 3, 4, 5)))
        assertEquals(0, squareSum(arrayOf()))
    }
}