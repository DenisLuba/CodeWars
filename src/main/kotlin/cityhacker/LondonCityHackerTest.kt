package cityhacker

import org.junit.Assert.assertEquals
import org.junit.Test

class LondonCityHackerTest {

    @Test
    fun exampleTest() {
        assertEquals("£7.80", londonCityHacker(arrayOf(12, "Central", "Circle", 21)));
        assertEquals("£3.90", londonCityHacker(arrayOf("Piccadilly", 56)));
        assertEquals("£7.20", londonCityHacker(arrayOf("Northern", "Central", "Circle")));
        assertEquals("£5.40", londonCityHacker(arrayOf("Piccadilly", 56, 93, 243)));
        assertEquals("£3.00", londonCityHacker(arrayOf(386, 56, 1, 876)));
        assertEquals("£0.00", londonCityHacker(arrayOf()));
    }
}