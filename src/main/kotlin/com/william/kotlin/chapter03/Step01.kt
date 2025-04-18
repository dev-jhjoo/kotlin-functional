package com.william.kotlin.chapter03

fun String.hello(): String {
    return "안녕하세요, $this 님!"
}

fun main() {
    val name = "William"
    println(name.hello())
}