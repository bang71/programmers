class Solution {
    fun solution(s: String): Int {
        var answer = s.length

        for (size in s.length / 2 downTo 1) {
            var length = s.length
            var repeatedString = mutableMapOf<Int, Int>()
            var keyNumber = 0

            s.chunked(size).reduce { acc, s ->
                if (acc == s) {
                    repeatedString[keyNumber] = repeatedString.getOrDefault(keyNumber, 1) + 1
                } else {
                    keyNumber++
                }
                s
            }

            if (repeatedString.isNotEmpty()) {
                repeatedString.forEach { 
                    length += it.value.toString().length
                    length -= (it.value - 1) * size
                }
            }
            
            if (answer > length) answer = length
        }

        return answer
    }
}