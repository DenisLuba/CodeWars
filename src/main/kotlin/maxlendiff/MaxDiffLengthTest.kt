package maxlendiff

import org.junit.Assert.assertEquals
import org.junit.Test


class MaxDiffLengthTest {
    @Test
    fun test() {
        println("mxdiflg Fixed Test")
        var s1 = arrayOf("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
        var s2 = arrayOf("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
        assertEquals(13, mxdiflg(s1, s2))
        s1 = arrayOf("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
        s2 = arrayOf("bbbaaayddqbbrrrv")
        assertEquals(10, mxdiflg(s1, s2))

        s1 = arrayOf("123456789", "123", "12", "1", "")
        s2 = arrayOf("s", "")
        assertEquals(9, mxdiflg(s1, s2))
    }
}