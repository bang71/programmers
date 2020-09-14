class Solution {
    fun solution(a: IntArray): Int {
        var answer: Int = 0
        
        var leftMin = a[0]
        
        a.forEachIndexed { index, it ->
            if (it <= leftMin) {
                answer++
                leftMin = it
            }
            else if (it <= a.slice(index..a.lastIndex).min()!!) {
                answer++
            }
        }
        
        return answer
    }
}