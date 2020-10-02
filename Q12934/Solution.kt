class Solution {
    fun solution(n: Long): Long {
        var sqrt = Math.sqrt(n.toDouble()).toLong()

        return if (sqrt.times(sqrt) == n) {
            (sqrt + 1).times(sqrt + 1)
        } else {
            -1
        }
    }
}
