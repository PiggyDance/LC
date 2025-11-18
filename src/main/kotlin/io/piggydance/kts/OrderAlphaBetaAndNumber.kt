package io.piggydance.kts

class OrderAlphaBetaAndNumber {
    fun solve(input: String): String {
        val alphas = input.filter { it.isLetter() }
        val nums = input.filter { it.isDigit() }
        return alphas + nums
    }
}
