fun main() {
    var brown = 10
    var yellow = 2
    var answer = intArrayOf()
    for (i in 1..yellow) {
        if (yellow % i == 0) {
            val row = yellow / i
            val column = i
            if (brown == (row + 2) *(column +2) -yellow){
                return intArrayOf(row+2,column+2)
            }
        }
    }
    return intArrayOf()
}
