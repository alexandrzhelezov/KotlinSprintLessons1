package org.example.lesson_4

fun main() {

    val trainingDay = 5
    val isEven = trainingDay % 2 == 0

    val trainingProgram = """
        Упражнение для рук: ${!isEven}
        Упражнения для ног: $isEven
        Упражнения для спины: $isEven
        Упражнения для пресса: ${!isEven}
        """.trimIndent()

    println(trainingProgram)

}