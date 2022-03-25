package com.algorithm.acmicpc.step3

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/10952
 */
fun main() = with(Scanner(System.`in`)){

    while (true) {
        val a = nextInt()
        val b = nextInt()

        if (a == 0 && b == 0)
            break
        println(a + b)
    }
}