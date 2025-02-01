package org.example.lesson_2

const val PERCENT = 100

fun main() {

    /* A = P * (1 + r)^n - формула сложных процентов
    A — итоговая сумма вклада
    P — начальная сумма вклада (70000р)
    r — годовая процентная ставка в виде десятичной дроби (16,7% = 0.167)
    n — количество лет (20 лет)
     */

    val depositAmount = 70000
    val interestRate = 16.7 / PERCENT
    val years = 20
    val finalDepositAmount = depositAmount * Math.pow(1 + interestRate, years.toDouble())

    println(String.format("%.3f", finalDepositAmount))

}