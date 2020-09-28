class Solution {
    fun solution(s: String): String {
        var answer = ""
        var isEven = true
        
        s.forEach {
            var ch = it
            
            isEven = if (ch == ' ') true
            else {
                if (isEven) ch = ch.toUpperCase()
                else ch = ch.toLowerCase()
                !isEven
            }
            
            answer += ch
        }
        
        return answer
    }
}
