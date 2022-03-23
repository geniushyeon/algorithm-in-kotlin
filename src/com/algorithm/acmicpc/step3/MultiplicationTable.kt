package com.algorithm.acmicpc.step3

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    val num = scanner.nextInt()
    scanner.close()

    for (i in 1 until 10) {
        println("$num * $i = ${num*i}")
    }
}
