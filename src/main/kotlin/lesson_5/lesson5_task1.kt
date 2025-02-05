package org.example.lesson_5

fun main() {

    val isRightResult = 4
    println("Сложите 2 + 2 и напишите результат в консоль")
    val incomingSum = readln().toInt()

    if (isRightResult == incomingSum) {
        println("Добро пожаловать!")
    } else
        println("Доступ запрещен.")

}