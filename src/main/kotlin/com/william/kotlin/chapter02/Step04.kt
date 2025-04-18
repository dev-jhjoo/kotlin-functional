package com.william.kotlin.chapter02



fun main() {
    fun multiply(a: Int, b: Int): Int = a * b
    val mulFunc = ::multiply
    println(mulFunc(4, 5)) // 20

    val op: (Int, Int) -> Int = { x, y -> x * y }
    println(op(4, 5)) // 20
}