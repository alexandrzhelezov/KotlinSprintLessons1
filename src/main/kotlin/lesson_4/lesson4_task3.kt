package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY = 20
const val SEASON = "зима"

fun main() {

    val isSunnyToday = true
    val isAwningOpenToday = true
    val humidityToday = 20
    val seasonToday = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${IS_SUNNY == isSunnyToday 
                    && IS_AWNING_OPEN == isAwningOpenToday 
                    && HUMIDITY == humidityToday 
                    && SEASON != seasonToday}")

}