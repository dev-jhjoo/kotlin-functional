package com.william.kotlin.chapter04

class User(){
    var name:String = ""
    var age:Int = 0

    override fun toString(): String {
        return "name: $name, age: $age"
    }
}