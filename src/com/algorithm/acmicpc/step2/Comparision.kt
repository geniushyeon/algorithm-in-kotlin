package com.algorithm.acmicpc.step2

import java.util.*

/**
 * 1330. 두 수 비교하기
 */
fun main() {

    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    scanner.close()
    print(compare(a, b))
}

fun compare(a: Int, b: Int): String {
    if (a > b)
        return ">"
    else if (a < b)
        return "<"

    return "=="
}