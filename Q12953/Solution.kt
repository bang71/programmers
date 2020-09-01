class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        
        answer = arr.reduce { acc, int ->
            val divisorFirst = getDivisors(acc)
            val divisorSecond = getDivisors(int)
            
            for (divisor in divisorFirst) {
                if (divisorSecond.contains(divisor))
                    return@reduce divisor * acc / divisor * int / divisor
            }

            return@reduce acc * int
        }
        
        return answer
    }
    
    private fun getDivisors(number: Int): List<Int> {
        val result = mutableListOf<Int>()

        for (divisor in 1..number/2) {
            if (number % divisor == 0) {
                result.add(divisor)
                result.add(number/divisor)
            }
        }

        return result.toSet().sortedDescending()
    }
}

