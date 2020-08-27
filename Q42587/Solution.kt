class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        var currentLocation = location

        var documents = priorities.toMutableList()

        while (!documents.isEmpty()) {
            val maxValue = documents.max()

            if (documents.first() == maxValue) {
                documents.removeAt(0)
                answer++

                if (currentLocation == 0) return answer
                else {
                    currentLocation--
                }

            } else {
                documents.add(documents.removeAt(0))
                if (currentLocation == 0) {
                    currentLocation = documents.count() - 1
                } else {
                    currentLocation--
                }
            }
        }

        return answer
    }
}