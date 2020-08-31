class Solution {
    
    fun solution(a: Int, b: Int): String {
        val week = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        val daysOfMonth = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        
        return week[(week.indexOf("FRI") + daysOfMonth.slice(0 until a-1).sum() + b-1) % 7]
    }
}