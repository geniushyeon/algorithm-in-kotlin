package com.algorithm.acmicpc.step4

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/10818
 */
fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val array = IntArray(n) { 0 }

    for (i in 0 until n) {
        array[i] = nextInt()
    }

    var max = array[0]
    var min = array[0]

    for (a in array) {
        if (a < min) {
            min = a
        } else if (a > max) {
            max = a
        }
    }

    print("$min $max")
}