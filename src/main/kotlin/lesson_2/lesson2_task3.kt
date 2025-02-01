package org.example.lesson_2

const val ONE_HOUR = 60

fun main() {

    val startHours = 9
    val startMinutes = 39
    val wayTime = 457
    val startTime = (startHours * ONE_HOUR) + startMinutes //время отправления в минутах
    val arrivalTime = startTime + wayTime // время прибытия в минутах
    val arrivalHoursTime = arrivalTime / ONE_HOUR // часы прибытия
    val arrivalMinutesTime = arrivalTime % ONE_HOUR // минуты прибытия
    val endTime = String.format("%02d:%02d", arrivalHoursTime, arrivalMinutesTime) // вывод в формате чч:мм

    println(endTime)

}