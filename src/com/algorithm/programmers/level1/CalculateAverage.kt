package com.algorithm.programmers.level1

fun main() {

    val array: IntArray = intArrayOf(1, 2, 3, 4)
    print(calculateAverage(array))
}

fun calculateAverage(arr: IntArray): Double {
    return arr.average()
}