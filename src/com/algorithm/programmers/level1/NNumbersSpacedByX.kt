package com.algorithm.programmers.level1

fun main() {
    val answer = solution(2, 5)

    for (i in answer.indices) {
        println(answer[i])
    }
}


fun solution(x: Int, n: Int): LongArray {
    val answer = LongArray(n)
    var value = x.toLong()

    for (i in 0 until n) {
        answer[i] = value
        value += x
    }
    return answer
}