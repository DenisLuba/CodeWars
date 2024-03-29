package geometric_sequence_elements

import org.junit.Assert.assertEquals
import org.junit.Test

class GeometricSequenceTest {

    private fun test(actual: String, expected: String) = assertEquals(actual, expected)

    @Test
    fun exampleTest() {
        test(geometricSequenceElements(2, 3, 5), "2, 6, 18, 54, 162")
        test(geometricSequenceElements(2, 2, 10), "2, 4, 8, 16, 32, 64, 128, 256, 512, 1024")
        test(geometricSequenceElements(1, -2, 10), "1, -2, 4, -8, 16, -32, 64, -128, 256, -512")
    }
}