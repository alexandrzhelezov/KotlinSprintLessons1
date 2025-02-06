package org.example.lesson_5

fun main() {

    val firstWinNumber = 5
    val secondWinNumber = 17

    println("Введите первое число от 0 до 42")
    val firstUserNumber = readln().toInt()

    println("Введите второе число от 0 до 42")
    val secondUserNumber = readln().toInt()

    if ((firstUserNumber == firstWinNumber || firstUserNumber == secondWinNumber) &&
        (secondUserNumber == firstWinNumber || secondUserNumber == secondWinNumber)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstUserNumber == firstWinNumber || firstUserNumber == secondWinNumber) ||
        (secondUserNumber == firstWinNumber || secondUserNumber == secondWinNumber)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
        println("Для победы нужны были числа $firstWinNumber и $secondWinNumber")
    }

}