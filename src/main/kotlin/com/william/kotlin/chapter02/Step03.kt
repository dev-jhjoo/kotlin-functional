package com.william.kotlin.chapter02

val names = listOf("William","Test","Sample name")

fun main() {
    names.forEach { println("이름 : $it") }

    val filtered = names.filter { it.startsWith("W") }
    println(filtered)  // [William]
}
