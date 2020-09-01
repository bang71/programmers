class Solution {
    fun solution(a: Int, b: Int): Long {
        return (minOf(a,b).toLong()..maxOf(a,b)).sum()
    }
}
