package com.william.kotlin.chapter01

val number = listOf(1,2,3,4,5)
val doubled = number.map { it * 2 }

fun main() {
    println(doubled)
}