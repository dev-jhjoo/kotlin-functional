package com.william.kotlin.chapter02

fun operation(type:String) : (Int, Int) -> Int {
    return when (type) {
        "plus" -> {a,b -> a + b}
        "minus" -> {a,b -> a - b}
        else -> {_, _ -> 0}
    }
}

fun main() {
    val add = operation("plus")
    println(add(10, 5))  // 15

    val sub = operation("minus")
    println(sub(10, 5))  // 5
}