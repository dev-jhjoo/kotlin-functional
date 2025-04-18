package com.william.kotlin.chapter03

fun List<Int>.averageOrZero(): Int {
    return if (this.isEmpty()) 0 else this.reduce { acc, i -> acc + i } / this.size
}

fun main() {
    println(listOf(10, 20, 30).averageOrZero())  // 20.0
    println(emptyList<Int>().averageOrZero())    // 0.0
}
