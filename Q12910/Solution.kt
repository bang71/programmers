class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = arr.filter { it % divisor == 0 }.toMutableList()
        
        if (answer.isEmpty()) answer.add(-1)
        
        return answer.sorted().toIntArray()
    }
}