package com.algorithm.acmicpc.step4

import java.util.*

/**
 * https://www.acmicpc.net/problem/1546
 */
fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val array = DoubleArray(n) { 0.0 }

    for (i in array.indices) {
        array[i] = nextDouble()
    }

    var max = array[0]
    for (i in array.indices) {
        if (array[i] > max) {
            max = array[i]
        }
    }

    var result = 0.0

    for (i in array.indices) {
        array[i] = array[i] / max * 100
        result += array[i]
    }

    print(result / n)
}