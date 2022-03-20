package com.algorithm.acmicpc.step2

import java.util.*

/**
 * 2753. 윤년
 */
fun main() {

    val scanner = Scanner(System.`in`)

    print(isLeapYear(scanner.nextInt()))
    scanner.close()
}

fun isLeapYear(year: Int): Int {

    return if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 1 else 0
}