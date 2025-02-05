package org.example.lesson_4

fun main() {

    val trainingDay = 5
    val handsAbsTraining = trainingDay % 2 == 1
    val legsBackTraining = trainingDay % 2 == 0

    val trainingProgram = """
        Упражнение для рук: $handsAbsTraining
        Упражнения для ног: $legsBackTraining
        Упражнения для спины: $legsBackTraining
        Упражнения для пресса: $handsAbsTraining
        """.trimIndent()

    println(trainingProgram)

}