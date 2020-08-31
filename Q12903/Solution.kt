class Solution {
    fun solution(s: String): String {
        val length = s.length
        val baseIndex = s.length / 2
        
        return when (length % 2) {
            1 -> "${s[baseIndex]}"
            else -> s.slice(baseIndex-1..baseIndex)
        }
    }
}