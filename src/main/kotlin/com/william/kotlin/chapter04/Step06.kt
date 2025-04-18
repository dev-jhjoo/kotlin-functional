package com.william.kotlin.chapter04

inline fun measureTime(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()

    val end = System.currentTimeMillis()
    println("걸린시간: ${end - start}")
}

fun main() {
    measureTime {
        Thread.sleep(100)
        println("작업완료")
    }
}