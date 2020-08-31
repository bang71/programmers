class Solution {
    fun solution(s: String): String {
        
        return s.split(" ")
            .toMutableList()
            .map {
                if (it != "") it.first().toUpperCase() + it.substring(1).toLowerCase()
                else it
            }
            .joinToString(" ")
    }
}