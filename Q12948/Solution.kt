class Solution {
    fun solution(phone_number: String): String {
        var part = phone_number.length - 4
        
        return "*".repeat(part) + phone_number.substring(part)
    }
}
