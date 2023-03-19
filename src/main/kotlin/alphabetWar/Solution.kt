package alphabetWar

val leftSide = mapOf(
    'w' to 4,
    'p' to 3,
    'b' to 2,
    's' to 1
)

val rightSide = mapOf(
    'm' to 4,
    'q' to 3,
    'd' to 2,
    'z' to 1
)
fun alphabetWar(fight : String) : String {
    var left = 0
    var right = 0
    fight.forEach {
            left += leftSide[it] ?: 0
            right += rightSide[it] ?: 0
    }

    return if (left > right) {
        "Left side wins!"
    } else if (right > left) {
        "Right side wins!"
    } else "Let's fight again!"
}