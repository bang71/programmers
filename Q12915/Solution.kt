class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.sortedWith(Comparator { t, t2 ->
            when {
                t[n] > t2[n] -> 1
                t[n] < t2[n] -> -1
                else -> {
                    if (t >= t2) 1
                    else -1
                }
            }
        }).toTypedArray()
    }
}
