package com.algorithm.acmicpc.step5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/2675
 */
fun main() = with(Scanner(System.`in`)) {

    val testCases = nextInt()

    for (i in 0 until testCases) {
        val repetition = nextInt()
        val word = next()

        for (j in word.indices) {
            for (k in 0 until repetition) {
                print(word[j])
            }
        }
        println()
    }
}