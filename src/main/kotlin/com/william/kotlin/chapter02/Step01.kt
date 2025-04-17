package com.william.kotlin.chapter02

fun calculate(x: Int, y: Int, op:(Int, Int) -> Int) : Int {
    return op(x, y)
}

fun main() {
    val sum = calculate(3, 2){x,y -> x+y}
    println(sum)

    val product = calculate(3, 2){x,y -> x*y}
    println(product)
}