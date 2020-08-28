class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0

        citations
            .forEach { citation ->
                answer = maxOf(answer, minOf(citations.filter { it >= citation }.count(), citation))
            }

        return answer
    }
}