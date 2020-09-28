class Solution {
    fun solution(n: Int): Int {
        var answer = n
       
        if (n == 0) return 0
        answer += (1..n/2).filter { n % it == 0 }.sum()
        
        return answer
    }
}
