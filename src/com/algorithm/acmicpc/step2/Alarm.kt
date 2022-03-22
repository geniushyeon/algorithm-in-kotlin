package com.algorithm.acmicpc.step2

import java.util.Scanner

/**
 * 2884. 알람 시계
 * 45분 일찍 알람 설정하기
 */
fun main() {

    val scanner = Scanner(System.`in`)

    var hour = scanner.nextInt()
    var minute = scanner.nextInt()
    scanner.close()

    if (hour == 0 && minute < 45) {
        hour = 23
        minute = minute + 60 - 45
    } else if (minute >= 45) {
        minute -= 45
    } else {
        hour -= 1
        minute = minute + 60 - 45
    }

    print("$hour $minute")

}