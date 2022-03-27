package com.algorithm.acmicpc.step5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/10809
 */
fun main() = with(Scanner(System.`in`)) {

    val input = next()
    val alphabets = Array(26) { -1 }

    for (i in input.indices) {
        for (j in alphabets.indices) {
            if (alphabets[input[i] - 'a'] != -1) {
                continue
            }
            alphabets[input[i] - 'a'] = i
        }
    }

    for (a in alphabets) {
        print("$a ")
    }
}