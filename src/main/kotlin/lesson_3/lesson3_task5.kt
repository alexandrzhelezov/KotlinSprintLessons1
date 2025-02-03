package org.example.lesson_3

fun main() {

    val startData = "D2-D4;0"
    val parts = startData.split(";")
    val partsOfSteps = parts[0].split("-")

    val fromWhere = partsOfSteps[0]
    val toWhere = partsOfSteps[1]
    val stepCount = parts[1]

    println(fromWhere)
    println(toWhere)
    println(stepCount)

}