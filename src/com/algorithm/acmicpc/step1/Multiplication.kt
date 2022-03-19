package com.algorithm.acmicpc.step1

import java.util.*

/**
 * 10998. A * B
 */
fun main() {

    val scanner = Scanner(System.`in`)
    val a: Int = scanner.nextInt()
    val b: Int = scanner.nextInt()

    print(multiplicate(a, b))
}

fun multiplicate(a: Int, b: Int): Int {
    return a * b
}