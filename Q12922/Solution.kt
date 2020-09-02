class Solution {
    fun solution(n: Int): String {
        var str = "수박"
        return str.repeat(n).run { substring(0, this.length/2) }
    }
}
