package com.algorithm.acmicpc.step3

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/11022
 */
fun main() = with(Scanner(System.`in`)) {

    for (i in 1..nextInt()) {
        val a = nextInt()
        val b = nextInt()
        println("Case #$i: $a + $b = ${a + b}")
    }
}