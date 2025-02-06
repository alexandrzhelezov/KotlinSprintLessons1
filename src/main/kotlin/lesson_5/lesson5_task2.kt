package org.example.lesson_5

const val LEGAL_AGE = 18

fun main() {

    println("Введите Ваш год рождения")
    val userBornYear = readln().toInt()

    val accessAge = 2025 - userBornYear

    if (accessAge >= LEGAL_AGE) {
        println("Показать экран со скрытым контентом")
    }

}