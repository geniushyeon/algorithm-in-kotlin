package com.algorithm.acmicpc.step4

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/2562
 */
fun main() = with(Scanner(System.`in`)){

    val array = IntArray(9) { 0 }

    for (i in array.indices) {
        array[i] = nextInt()
    }

    var index = 0
    var max = array[index]

    for (i in 1 until array.size) {
        if (array[i] > max) {
            index = i
            max = array[index]
        }
    }

    println(max)
    println(index + 1)
}