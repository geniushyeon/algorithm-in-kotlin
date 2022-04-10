package com.algorithm.acmicpc.step5

import java.util.Scanner
import java.util.StringTokenizer

/**
 * https://www.acmicpc.net/problem/1152
 */
fun main()  {

    val scanner = Scanner(System.`in`)
    val word = scanner.nextLine()
    scanner.close()

    val wordArray = word.split(' ')

    var length = 0

    for (w in wordArray) {
        if (w == "") {
            continue
        }
        length++
    }

    println(length)

    // 좀 더 고급진 방법
    val st = StringTokenizer(word, " ")
    println(st.countTokens())
}