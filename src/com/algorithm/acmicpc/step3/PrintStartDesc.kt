package com.algorithm.acmicpc.step3

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/2439
 */
fun main() = with(Scanner(System.`in`)){

    val num = nextInt()

    for (i in 1 .. num) {
        for (j in num downTo 1) {
            if (i < j)
                print(" ")
            else
                print("*")
        }
        println("")
    }
}