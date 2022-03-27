package com.algorithm.acmicpc.step5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/11720
 */
fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val input = next()
    var sum: Long = 0

    for (i in 0 until n) {
        sum += input.substring(i, i+1).toLong()
    }

    println(sum)
}