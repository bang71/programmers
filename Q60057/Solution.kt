class Solution {
    fun solution(s: String): Int {
        var answer = s.length

        for (size in s.length / 2 downTo 1) {
            var length = s.length
            var repeatedString = mutableMapOf<String, Int>()

            s.chunked(size).reduce { acc, s ->
                if (acc == s) {
                    repeatedString[acc] = repeatedString.getOrDefault(acc, 0) + 1
                }
                s
            }

            if (repeatedString.isNotEmpty()) {
                length += repeatedString.count()
                length -= repeatedString.entries.sumBy { it.value } * size
            }
            
            if (answer > length) answer = length
        }

        return answer
    }
}