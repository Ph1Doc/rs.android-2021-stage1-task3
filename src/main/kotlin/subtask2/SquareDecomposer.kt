package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {

        return if (number < 5) {
            null
        } else {
            val result = findSquaresFor(number.toDouble(), number*number.toDouble())
            Array(result.size - 1) { i -> result[i] }
        }
    }

    private fun findSquaresFor(number: Double, square: Double): Array<Int> {

        var j = (number - 1)
        if (square == 0.0) {
            return arrayOf(number.toInt())
        }

        while (j > 0) {
            if (square - j * j >= 0) {
                val squares = findSquaresFor(j, (square - j * j))
                if (squares.isNotEmpty()) {
                    return squares + arrayOf(number.toInt())
                }
            }
            j--
        }
        return arrayOf()
    }
}
