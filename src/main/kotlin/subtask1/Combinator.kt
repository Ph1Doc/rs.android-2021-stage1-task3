package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {

        val numberOfPosters = array[0]
        val numberOfColors = array[1]

        if (numberOfColors == numberOfPosters) {
            return 1
        } else {
            for (i in 1 until numberOfColors) {
                val n = permutations(numberOfColors)
                val nr = permutations(numberOfColors - i) * permutations(i)
                val c = n/nr

                if (c >= numberOfPosters) {
                    return i
                }
            }
        }

        return null
    }

    private fun permutations(number: Int): Double {
        var perm = 1.0
        for (i in 1..number) {
            perm *= i
        }
        return perm
    }
}
