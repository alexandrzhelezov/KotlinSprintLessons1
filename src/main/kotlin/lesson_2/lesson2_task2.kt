package org.example.lesson_2

fun main() {

    val mainWorkers = 50
    val mainPayments = 30000
    val internWorkers = 30
    val internPayments = 20000
    val countsOfWorkers = mainWorkers + internWorkers // общее кол-во сотрудников

    val mainWorkersPayments = mainWorkers * mainPayments //выплата зарплаты постоянных сотрудников
    println(mainWorkersPayments)

    val paymentsAfterInterns = mainWorkersPayments + (internWorkers * internPayments) // Общие расходы по ЗП после прихода стажеров
    println(paymentsAfterInterns)

    val averagePayments = paymentsAfterInterns / countsOfWorkers //Средняя ЗП одного сотрудника после устройства стажеров
    println(averagePayments)

}