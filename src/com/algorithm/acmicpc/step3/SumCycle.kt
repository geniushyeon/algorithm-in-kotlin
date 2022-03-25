package com.algorithm.acmicpc.step3

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/1110
 */
fun main() = with(Scanner(System.`in`)) {

    var n = nextInt()
    if (n < 10)
        n *= 10

    var cycle = 0
    val x = n

    while (true) {
        val y = n % 10
        n = n / 10 + n % 10
        n = y * 10 + n % 10
        cycle++

        if (x == n)
            break

    }
    println(cycle)
}