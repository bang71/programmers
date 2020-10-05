class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var total: Long = 0
        
        repeat(n) {
            total += x.toLong()
            answer += total
        }
        
        return answer
    }
}
