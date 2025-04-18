package com.william.kotlin.chapter03

fun Int.square(): Int {
    return this * this
}

fun main() {
    println(4.square())
}