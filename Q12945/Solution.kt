class Solution {
    private val fibonacciList = mutableListOf<Int>()
    
    fun solution(n: Int): Int {
        return fibonacci(n)
    }
    
    fun fibonacci(n: Int): Int {
        if (fibonacciList.getOrNull(n-2) != null) {
            return fibonacciList[n-2]
        }
        return when (n) {
            0, 1 -> n
            else -> {
                fibonacciList += (fibonacci(n-1) + fibonacci(n-2)) % 1234567
                fibonacciList.last()
            }
        }
    }
}