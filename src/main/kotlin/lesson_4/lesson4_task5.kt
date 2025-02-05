package org.example.lesson_4

fun main() {

    println("Корпус повреждён?")
    val isShipDamaged = readln().toBoolean()

    println("Колличество экипажа?")
    val shipTeam = readln().toInt()

    println("Количество ящиков с провизией на борту?")
    val boxCount = readln().toInt()

    println("Метеоусловия благоприятны?")
    val isGoodWeather = readln().toBoolean()

    val decision = (!isShipDamaged && shipTeam in 55..70 && boxCount > 50) ||
            (isShipDamaged && shipTeam == 70 && isGoodWeather && boxCount >= 50)

    println("Корабль может отправиться в плавание? $decision")

}