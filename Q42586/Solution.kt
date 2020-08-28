class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf(1)
        var workDays = intArrayOf()

        progresses.forEachIndexed { index, it ->
            workDays += calculateWorkDays(it, speeds[index])
        }

        var answerIndex = 0
        workDays.reduce { acc, i ->
            if (acc > i) {
                answer[answerIndex]++
                acc
            } else {
                answer += 1
                answerIndex++
                i
            }
        }

        return answer
    }

    fun calculateWorkDays(progress: Int, speed: Int): Int {
        if ((100 - progress) % speed > 0) {
            return (100 - progress) / speed + 1
        }
        return (100 - progress) / speed
    }
}