package org.example.lesson_1

fun main() {

    val totalSeconds = 6480
    val hours = "0" + totalSeconds / 3600 // получаем кол-во часов
    val remainingSeconds = totalSeconds % 3600 // получаем остаток секунд после вычитания часа
    val minutes = remainingSeconds / 60 // получаем минуты, поделив остаток секунд на 60
    val seconds = "0" + remainingSeconds % 60 //получаем секунды в остатке деления остатка секунд на 60

    println("$hours:$minutes:$seconds")

}