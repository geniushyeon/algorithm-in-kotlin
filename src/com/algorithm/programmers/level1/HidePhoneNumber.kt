package com.algorithm.programmers.level1

fun main() {

    print(hideNumber("01012345678"))
}

fun hideNumber(phone_number: String): String {

    var answer = ""
    val length = phone_number.length - 4

    for (i in 0 until length) {
        answer += "*"
    }

    return answer + phone_number.subSequence(length, length + 4)
}