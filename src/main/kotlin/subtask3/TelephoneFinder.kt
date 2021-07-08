package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        val keypad =
           mapOf( "0" to arrayOf("8"),
            "1" to arrayOf("2", "4"),
            "2" to arrayOf("1", "3", "5"),
            "3" to arrayOf("2", "6"),
            "4" to arrayOf("1", "5", "7"),
            "5" to arrayOf("2", "4", "6", "8"),
            "6" to arrayOf("3", "5", "9"),
            "7" to arrayOf("4", "8"),
            "8" to arrayOf("5", "7", "9", "0"),
            "9" to arrayOf("6", "8"))

        if (number.toInt() < 0) {
            return null
        } else {
            val numbers = mutableListOf<String>()
            for (i in number.indices) {
                val neighbours = keypad[number.substring(i,i+1)]

                if (neighbours != null) {
                    for (element in neighbours) {
                        val chars = number.toCharArray()
                        chars[i] = element[0]
                        val newNeighbour = String(chars)
                        numbers.add(newNeighbour)
                        }
                }
            }
            return Array(numbers.size) { i -> numbers[i] }
        }
    }
}
