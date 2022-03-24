package com.algorithm.acmicpc.step3

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/10871
 */
fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    val x = nextInt()

    val array = Array(n) { 0 }

    for (i in 0 until n) {
        array[i] = nextInt()
    }

    for (a in array) {
        if (a < x) {
            print("$a ")
        }
    }
}