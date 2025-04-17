package com.william.kotlin.chapter01

val printMessage: (String) -> Unit = {println("메시지: $it")}

fun main() {
    printMessage("Hello")
}