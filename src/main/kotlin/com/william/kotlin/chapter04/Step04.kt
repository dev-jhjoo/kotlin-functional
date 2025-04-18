package com.william.kotlin.chapter04

fun main() {
    val result = "William".also {
        println("before: $it")
    }.uppercase()

    println("after: $result")
}