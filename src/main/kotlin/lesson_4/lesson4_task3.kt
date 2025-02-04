package org.example.lesson_4

fun main() {

    val sunWeather = true
    val awning = true
    val humidity = 20
    val season = "не зима"

    val todaySunWeather = true
    val todayAwning = true
    val todayHumidity = 20
    val todaySeason = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunWeather == todaySunWeather && awning == todayAwning &&
    humidity == todayHumidity && season == todaySeason}")

}