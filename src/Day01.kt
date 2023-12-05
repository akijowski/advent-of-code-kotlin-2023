fun main() {
    fun part1(input: List<String>): Int {
        return input.map { l ->
            val digits = l.filter { it.isDigit() }.map { it.digitToInt() }
            (digits.first() * 10) + digits.last()
        }.sum()
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 142) { "got ${part1(testInput)}"}

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
