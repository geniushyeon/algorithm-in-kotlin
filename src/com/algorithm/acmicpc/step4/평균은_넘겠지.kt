package com.algorithm.acmicpc.step4

import java.util.Scanner
import kotlin.math.roundToInt

/**
 * https://www.acmicpc.net/problem/4344
 */
fun main() = with(Scanner(System.`in`)) {

    val c = nextInt()

    for (i in 0 until c) {
        val n = nextInt()
        val array = DoubleArray(n) { 0.0 }
        var avg = 0.0

        for (j in 0 until n) {
            array[j] = nextDouble()
            avg += array[j]
        }
        avg /= n

        var count = 0
        for (j in 0 until n) {
            if (array[j] > avg)
                count++
        }

        avg = count / n.toDouble() * 100
        val ratio = (avg * 1000).roundToInt() / 1000.0
        val ratioToString = "%.3f%%".format(ratio)
        println(ratioToString)
    }
}