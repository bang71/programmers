class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        numbers.forEachIndexed { index, first ->
            numbers.drop(index+1).forEach { second ->
                answer += first + second
            }
        }
        
        return answer.toSet().sorted().toIntArray()
    }
}