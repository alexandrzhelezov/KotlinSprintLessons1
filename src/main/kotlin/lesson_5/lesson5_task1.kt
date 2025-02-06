package org.example.lesson_5

fun main() {

    val firstNumber = 3
    val secondNumber = 4
    val isRightResult = firstNumber + secondNumber
    println("Сложите $firstNumber + $secondNumber и напишите результат в консоль")
    val incomingSum = readln().toInt()

    if (isRightResult == incomingSum) {
        println("Добро пожаловать!")
    } else
        println("Доступ запрещен.")

}