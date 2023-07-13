class Solution {
    fun solution(s: String): IntArray {
        var tempStr = s
        var removedZeroCount = 0
        var transformationCount = 0

        while(tempStr != "1") {
            val beforeLength = tempStr.length
            tempStr = tempStr.replace("0", "")
            val afterLength = tempStr.length
            removedZeroCount += (beforeLength - afterLength)
            tempStr = Integer.toBinaryString(afterLength)
            transformationCount++
        }

        return intArrayOf(transformationCount, removedZeroCount)
    }
}


fun main(args: Array<String>) {
    val solution = Solution()

    // 테스트 케이스를 실행하고 결과를 출력
    val testCase1 = solution.solution("110010101001")
    val testCase2 = solution.solution("01110")
    val testCase3 = solution.solution("1111111")

    println("Test case 1 result: ${testCase1.joinToString(", ")}") // 기대하는 출력: 3, 8
    println("Test case 2 result: ${testCase2.joinToString(", ")}") // 기대하는 출력: 3, 3
    println("Test case 3 result: ${testCase3.joinToString(", ")}") // 기대하는 출력: 4, 1
}