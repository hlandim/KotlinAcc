package com.example.hugolandimsantos.teste

/**
 * Created by hugo.landim.santos on 23/01/2018.
 */

enum class Color {
    RED,GREEN, BLUE
}

class Car(var color: Color)

fun main(args: Array<String>) {
    val car = Car(Color.BLUE)
    println(car.color)
}