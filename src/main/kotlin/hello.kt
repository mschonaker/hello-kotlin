package io.github.mschonaker.hellokotlin

fun main(args : Array<String>) {
    println("Hello, world!")

    val message = App.greet("kotlin")
    println(message)

    val message2 = Message("kotlin", 55);
    println("Result: ${App.greet(message2)}")

}