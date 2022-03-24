package com.algorithm.acmicpc.step3

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/11021
 */
fun main() {

    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()

    val array = Array(t) { 0 }

    for (i in 0 until t) {
        val a = scanner.nextInt()
        val b = scanner.nextInt()

        array[i] = a + b
    }
    scanner.close()

    for (i in 0 until t) {
        println("Case #${i + 1}: ${array[i]}")
    }
}