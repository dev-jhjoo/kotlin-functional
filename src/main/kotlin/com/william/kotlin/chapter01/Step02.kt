package com.william.kotlin.chapter01

/*
 * Passing trailing lambdas
 *
 * According to Kotlin convention,
 * if the last parameter of a function is a function,
 * then a lambda expression passed as the corresponding argument
 * can be placed outside the parentheses:
 *
 * e.g.
 * fun foo(
 *     bar: Int = 0,
 *     baz: Int = 1,
 *     qux: () -> Unit,
 * ) { /*...*/ }
 * foo(1) { println("hello") }     // Uses the default value baz = 1
 * foo(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
 * foo { println("hello") }        // Uses both default values bar = 0 and baz = 1
 */

fun operate(x: Int, y:Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun main() {
    val result = operate(4,2) { a, b -> a * b }
    println(result)
}