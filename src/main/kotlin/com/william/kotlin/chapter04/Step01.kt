package com.william.kotlin.chapter04

fun main() {
    val name:String? = "William"
//    val name:String? = null
    name?.let {
        println("Hello, $name!")
    }
}