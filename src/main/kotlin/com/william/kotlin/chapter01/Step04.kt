package com.william.kotlin.chapter01

val greet: (String) -> String = {name -> "Hello, $name!"}

fun main() {
    val greeting = greet("William")
    println(greeting)
}