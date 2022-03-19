package com.algorithm.acmicpc.step1

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val a: Int = scanner.nextInt()
    val b: Int = scanner.nextInt()

    print(divide(a, b))
}

fun divide(a: Int, b: Int): Double {
    return a.toDouble() / b.toDouble()
}