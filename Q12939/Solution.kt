class Solution {
    fun solution(s: String): String {
        val numbers = s.split(" ").map { it.toInt() }
        
        return "${numbers.min()} ${numbers.max()}"
    }
}