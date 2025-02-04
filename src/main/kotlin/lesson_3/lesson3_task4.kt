package org.example.lesson_3

fun main() {

    var fromWhere: String
    var toWhere: String
    var stepNumber: Int

    fromWhere = "E2"
    toWhere = "E4"
    stepNumber = 1
    val firstStep = ("$fromWhere-$toWhere;Номер хода $stepNumber")
    println(firstStep)

    fromWhere = "D2"
    toWhere = "D3"
    val secondStep = ("$fromWhere-$toWhere;Номер хода ${stepNumber + 1}")
    println(secondStep)

}