package org.example.lesson_4

const val totalTables = 13

fun main() {

    val todayTables = 13
    val tomorrowTables = 9

    println("Доступность столиков на сегодня: ${todayTables < totalTables}")
    println("Доступность столиков на завтра: ${tomorrowTables < totalTables}")

}