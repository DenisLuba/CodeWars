package accum

import org.junit.Assert.assertEquals
import org.junit.Test

class AccumulTest {

    private fun testing(actual: String, expected: String) = assertEquals(actual, expected)

    @Test
    fun test() {
        println("Fixed Tests Accum")
        testing(accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu")
        testing(accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb")

    }
}