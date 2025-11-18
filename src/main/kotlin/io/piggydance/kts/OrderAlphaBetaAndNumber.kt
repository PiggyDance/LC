package io.piggydance.kts

class OrderAlphaBetaAndNumber {
    fun solve(input: String): String {
        val alphaArray = IntArray(26)
        val numArray = IntArray(10)
        input.toCharArray().forEach {
            if (it.isLetter()) {
                alphaArray[it - 'a'] = 1
            } else if (it.isDigit()) {
                numArray[it - '0'] = 1
            }
        }

        val result = mutableListOf<Char>()
        alphaArray.forEachIndexed { i, v ->
            if (v > 0) {
                result.add('a' + i)
            }
        }
        numArray.forEachIndexed { i, v ->
            if (v > 0) {
                result.add('0' + i)
            }
        }
        return result.joinToString("")
    }
}
