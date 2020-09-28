class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        var diff = 'Z' - 'A' + 1
        
        s.forEach {
            val ch = it
            
            answer += if (ch == ' ') ch
            else if (ch <='Z' && (ch + n) > 'Z' || ch <='z' && (ch + n) > 'z') ch + n - diff
            else ch + n
        }
        
        return answer
    }
}
