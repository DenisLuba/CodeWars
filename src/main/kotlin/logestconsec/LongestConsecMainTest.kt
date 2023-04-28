package logestconsec

import org.junit.Assert.assertEquals
import org.junit.Test

class LongestConsecMainTest {
    //.........................
    @Test
    fun test() {
        println("longestConsec Fixed Tests")
        testing(longestConsec(arrayOf<String>("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"), 2), "abigailtheta")
        testing(longestConsec(arrayOf<String>("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"), 3), "aanlljrrrxxdqqqaaabbboocccffuucccjjjkkkjyyyeehh")
        testing(longestConsec(arrayOf("abc", "a", "aaaa", "aaaaa", "bbbbb", "d", "bbbbbb"), 7), "abcaaaaaaaaaabbbbbdbbbbbb")
        testing(longestConsec(arrayOf(""), 7), "")
        testing(longestConsec(arrayOf("", "", "", ""), -4), "")
        testing(longestConsec(arrayOf("uooooccjddj", "ppgghhffvi", "iimncuuwfeyygg", "uurrttwwallf", "jjyeiiycu", "hciittybccff", "cxxttxaggdyy", "xxeyyms", "mygguvwovvrcuu"), 2), "iimncuuwfeyygguurrttwwallf")
        testing(longestConsec(arrayOf("zzzzzzzzzzzz", "wkppv", "ixoyx", "3452", "it"), 3),  "zzzzzzzzzzzzwkppvixoyx")
        testing(longestConsec(arrayOf("it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"), 3),  "ixoyx3452zzzzzzzzzzzz")

    }
    companion object {
        private fun testing(actual:String, expected:String) {
            assertEquals(expected, actual)
        }
    }
}