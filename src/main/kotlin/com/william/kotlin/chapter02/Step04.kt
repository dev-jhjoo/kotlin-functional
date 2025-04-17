package com.william.kotlin.chapter02

val op: (Int, Int) -> Int = { x, y -> x * y }

fun main() {
    fun multiply(a: Int, b: Int): Int = a * b

    val mulFunc: (Int, Int) -> Int = ::multiply
    println(mulFunc(4, 5)) // 20
}