package cityhacker

fun londonCityHacker(journey: Array<Any>): String {
    journey.toMutableList().map { if (it is Int) 1.5 else 2.4 }
        .runningReduce { acc, any -> if (acc == 1.5 && any == 1.5) 0.0 else any}
        .sum()
        .let { return String.format("£%.2f", it).replace(",", ".") }
}
