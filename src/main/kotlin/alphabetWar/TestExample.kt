package alphabetWar

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class TestExample {
    @Test
    fun textFixed() {
        assertEquals("Right side wins!", alphabetWar("z"))
        assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
        assertEquals("Right side wins!", alphabetWar("zzzzs"))
        assertEquals("Left side wins!", alphabetWar("wwwwww"))
    }
}