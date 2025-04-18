package com.william.kotlin.chapter04

fun main() {
    val sb = StringBuilder()
    val message = with(sb){
        append("Hello, ")
        append("World!")
        toString()
    }
    println(message)
}