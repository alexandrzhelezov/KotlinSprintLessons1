package org.example.lesson_4

const val MIN_SHIP_MATES = 55
const val MAX_SHIP_MATES = 70
const val TOTAL_BOX_COUNT = 50

fun main() {

    println("Корпус повреждён?")
    val isShipDamaged = readln().toBoolean()

    println("Колличество экипажа?")
    val shipTeam = readln().toInt()

    println("Количество ящиков с провизией на борту?")
    val boxCount = readln().toInt()

    println("Метеоусловия благоприятны?")
    val isGoodWeather = readln().toBoolean()

    val decision = (!isShipDamaged && shipTeam in MIN_SHIP_MATES..MAX_SHIP_MATES && boxCount > TOTAL_BOX_COUNT) ||
            (isShipDamaged && shipTeam == MAX_SHIP_MATES && isGoodWeather && boxCount >= TOTAL_BOX_COUNT)

    println("Корабль может отправиться в плавание? $decision")

}