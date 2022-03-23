package com.algorithm.acmicpc.step3

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    var a: Int
    var b: Int

    val array = Array(size) { 0 }

    for (i in 0 until size) {
        a = scanner.nextInt()
        b = scanner.nextInt()
        array[i] = a + b
    }
    scanner.close()

    printArray(array)
}

fun printArray(array: Array<Int>) {
    for (element in array)
        println(element)
}