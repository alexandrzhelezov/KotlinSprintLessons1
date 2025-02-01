package org.example.lesson_1

const val ONE_MINUTE = 60 // 1 минута в секундах
const val SECONDS_IN_HOUR = 3600 // кол-во секунд в часе

fun main() {

    val totalSeconds = 6480
    val hours = totalSeconds / SECONDS_IN_HOUR // получаем кол-во часов
    val remainingSeconds = totalSeconds % SECONDS_IN_HOUR // получаем остаток секунд после вычитания часа
    val minutes = remainingSeconds / ONE_MINUTE // получаем минуты, поделив остаток секунд на 60
    val seconds = remainingSeconds % ONE_MINUTE //получаем секунды в остатке деления остатка секунд на 60
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds) // формат вывода с двумя цифрами

    println(formattedTime)

}