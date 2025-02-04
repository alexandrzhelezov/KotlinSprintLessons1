package org.example.lesson_4

fun main() {

    val minWeight = 35
    val maxWeight = 100
    val volume = 100

    val weightCargo1 = 20
    val volumeCargo1 = 80
    val weightCargo2 = 50
    val volumeCargo2 = 100

    println("Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории 'Average': " +
            "${weightCargo1 > minWeight && weightCargo1 <= maxWeight && volumeCargo1 < volume}")

    println("Груз с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории 'Average': " +
            "${weightCargo2 > minWeight && weightCargo2 <= maxWeight && volumeCargo2 < volume}")

}