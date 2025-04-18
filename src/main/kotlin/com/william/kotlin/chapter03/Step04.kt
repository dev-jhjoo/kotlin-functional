package com.william.kotlin.chapter03

open class Animal()
class Dog : Animal()

fun Animal.say() = "animal"
fun Dog.say() = "dog"

fun main() {
    val a: Animal = Dog()
    println(a.say()) // dog
}
