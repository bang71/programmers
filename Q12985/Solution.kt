class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        while ((a-1).shr(answer) != (b-1).shr(answer)) answer++ 

        return answer
    }
}
