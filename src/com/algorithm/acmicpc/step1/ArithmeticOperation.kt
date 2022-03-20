package com.algorithm.acmicpc.step1

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val a: Int = scanner.nextInt()
    val b: Int = scanner.nextInt()
    scanner.close()

    println(sum(a, b))
    println(subtraction(a, b))
    println(multiplicate(a, b))
    println(divide(a, b))
    println(getRemain(a, b))
}

fun getRemain(a: Int, b: Int): Int {
    return a % b
}