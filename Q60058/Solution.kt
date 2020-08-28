class Solution {
    fun solution(p: String): String {

        return divideString(p)
    }

    fun divideString(p: String): String {
        if (p == "") return ""

        var u: String = ""
        var v: String = ""
        var basket = 0

        for ((index, value) in p.withIndex()) {
            if (value == '(') basket++
            else basket--

            if (basket == 0) {
                u = p.slice(0..index)
                v = p.slice(index + 1..p.lastIndex)
                break
            }
        }

        if (u.first() == '(') return u + divideString(v)

        return "(${divideString(v)})" + fixBasket(u)
    }

    private fun fixBasket(u: String): String {
        var result = ""
        u.slice(1 until u.lastIndex).forEach {
            if (it == '(') result += ')'
            else result += '('
        }
        return "$result"
    }
}