package org.example.lesson_3

fun main() {

    val startData = "D2-D4;0"
    val parts = startData.split("-", ";")
    val fromWhere = parts[0]
    val toWhere = parts[1]
    val stepCount = parts[2]

    println(fromWhere)
    println(toWhere)
    println(stepCount)

}