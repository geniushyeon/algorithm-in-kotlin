package com.algorithm.acmicpc.step3

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    scanner.close()

    var result = 0

    for (i in 1..n) {
        result += i
    }

    println(result)
}