package com.algorithm.acmicpc.step4

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/8958
 */
fun main() = with(Scanner(System.`in`)) {

    val testCase = nextInt()
    val array = Array(testCase) { "" }

    for (i in 0 until testCase) {
        array[i] = next()
    }

    for (i in 0 until testCase) {
        var count = 0
        var sum = 0

        for (j in 0 until array[i].length) {
            if (array[i][j] == 'O') {
                count++
            } else {
                count = 0
            }
            sum += count
        }

        println(sum)
    }
}