package com.algorithm.acmicpc.step2

import java.util.Scanner

/**
 * 9498. 시험 성적
 */
fun main() {

    val scanner = Scanner(System.`in`)

    print(getResult(scanner.nextInt()))
    scanner.close()
}

fun getResult(score: Int): Char {

    return when (score) {
        in 90..100 -> 'A'
        in 80..90 -> 'B'
        in 70..80 -> 'C'
        in 60..70 -> 'D'
        else -> 'F'
    }
}