package com.algorithm.acmicpc.step1

import java.util.Scanner

/**
 * 1000. A + B
 */
fun main() {

    val sc = Scanner(System.`in`)

    val a: Int = sc.nextInt()
    val b: Int = sc.nextInt()
    sc.close()

    print(sum(a, b))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}