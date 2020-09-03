class Solution {
    fun solution(operations: Array<String>): IntArray {
        var answer = mutableListOf<Int>()
        
        operations.forEach {
            val (operator, value) = it.split(" ")
            if (operator == "I") {
                answer.add(value.toInt())
            } else if (answer.isNotEmpty()) {
                if (value == "1") answer.remove(answer.max()!!)
                else answer.remove(answer.min()!!)
            }
        }

        return if (answer.isEmpty()) intArrayOf(0,0)
        else intArrayOf(answer.max()!!, answer.min()!!)
        
    }
}
