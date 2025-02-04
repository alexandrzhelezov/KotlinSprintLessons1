package org.example.lesson_1

const val ONE_MINUTE = 60

fun main() {

    val totalSeconds = 6480
    val hours = totalSeconds / (ONE_MINUTE * 60)
    val remainingSeconds = totalSeconds % (ONE_MINUTE * 60)
    val minutes = remainingSeconds / ONE_MINUTE
    val seconds = remainingSeconds % ONE_MINUTE
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)

}