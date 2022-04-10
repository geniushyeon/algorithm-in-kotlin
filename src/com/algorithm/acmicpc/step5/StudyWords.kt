package com.algorithm.acmicpc.step5

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/1157
 */
fun main() {

    val scanner = Scanner(System.`in`)
    val word = scanner.next().uppercase()

    scanner.close()

    val countArray = IntArray(26)
    var max = -1
    var st = '?'

    for (i in word.indices) {
        val j = (word[i] - 65).code
        countArray[j]++

        if (max < countArray[j]) {
            max = countArray[j]
            st = word[i]
        } else if (max == countArray[j]) {
            st = '?'
        }
    }
    print(st)
}