package com.algorithm.acmicpc.step4

import java.util.*

/**
 * https://www.acmicpc.net/problem/3052
 */
fun main() = with(Scanner(System.`in`)) {

    val numArray = IntArray(10) { 0 }

    for (i in numArray.indices) {
        numArray[i] = nextInt()
    }
    val set = mutableSetOf<Int>()

    for (i in numArray.indices) {
        numArray[i] = numArray[i] % 42
        set.add(numArray[i])
    }

    println(set.size)
}