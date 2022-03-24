package com.algorithm.acmicpc.step3

import java.util.Scanner

/**
 * https://www.acmicpc.net/problem/2438
 */
fun main() = with(Scanner(System.`in`)){

    for (i in 1 .. nextInt()) {
        for (j in 1 .. i) {
            print("*")
        }
        println("")
    }
}