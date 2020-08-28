class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var basket = mutableListOf<Int>()
        
        moves.forEach {
            var getDoll = 0
            for (i in 0 until board[0].count()) {
                if (board[i][it - 1] != 0) {
                    getDoll = board[i][it- 1]
                    board[i][it - 1] = 0
                    break
                }
            }
            
            if (basket.isNotEmpty() && basket.last() == getDoll) {
                basket.removeAt(basket.lastIndex)
                answer += 2
            } else if (getDoll != 0) {
                basket.add(getDoll)
            }
        }
        
        return answer
    }
}