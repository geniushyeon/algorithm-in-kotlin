package com.algorithm.acmicpc.step2

import java.util.*

/**
 * 14681. 사분면 고르기
 */
fun main() {

    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    val y = scanner.nextInt()
    scanner.close()

    print(getQuadrant(x, y))
}

fun getQuadrant(x: Int, y: Int): Int {

    return if (x > 0) {
        if (y > 0)
            1
        else
            4
    } else {
        if (y > 0)
            2
        else
            3
    }
}