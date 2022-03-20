package com.algorithm.acmicpc.step1

import java.util.Scanner

/**
 * 1001. A - B
 */
fun main() {

    val scanner = Scanner(System.`in`)
    val a: Int = scanner.nextInt()
    val b: Int = scanner.nextInt()
    scanner.close()

    print(subtraction(a, b))
}

fun subtraction(a: Int, b: Int): Int {
    return a - b
}