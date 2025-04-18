package com.william.kotlin.chapter04

fun main() {
    val user = User().apply {
        name = "William"
        age = 35
    }
    println(user.toString())
}