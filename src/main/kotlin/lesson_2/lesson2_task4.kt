package org.example.lesson_2

const val FIRST_PERCENT = 100

fun main() {

    val crystalOre = 7
    val metalOre = 11
    val buff = 20
    val buffedCrystalOre = (crystalOre * buff) / FIRST_PERCENT // кол-во баффа кристаллической руда
    val buffedMetalOre = (metalOre * buff) / FIRST_PERCENT // кол-во баффа металл.руды

    println(buffedCrystalOre)
    println(buffedMetalOre)

}