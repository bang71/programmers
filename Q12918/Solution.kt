class Solution {
    fun solution(s: String): Boolean {
        
        return "^\\d{4}$|^\\d{6}$".toRegex().matches(s)
    }
}
