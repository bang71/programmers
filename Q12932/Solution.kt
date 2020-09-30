class Solution {
    fun solution(n: Long): IntArray {
        
        return n.toString().map { it - '0' }.reversed().toIntArray()
    }
}
