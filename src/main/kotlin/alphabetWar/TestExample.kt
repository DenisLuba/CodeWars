package alphabetWar

import org.junit.Assert.assertEquals
import org.junit.Test


class TestExample {
    @Test
    fun textFixed() {
        assertEquals("Right side wins!", alphabetWar("z"))
        assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
        assertEquals("Right side wins!", alphabetWar("zzzzs"))
        assertEquals("Left side wins!", alphabetWar("wwwwww"))
    }
}