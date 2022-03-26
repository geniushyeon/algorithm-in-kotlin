package com.algorithm.acmicpc.step4

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/2577
 */
fun main() = with(Scanner(System.`in`)) {

    val a = nextInt()
    val b = nextInt()
    val c = nextInt()

    val num = a * b * c
    val numArray = num.toString().toCharArray()

    val array = IntArray(10) { 0 }

    for (element in numArray) {
        for (j in 0 until 10) {
            if (Character.getNumericValue(element)== j) {
                array[j]++
            }
        }
    }

    for (i in array) {
        println(i)
    }
}