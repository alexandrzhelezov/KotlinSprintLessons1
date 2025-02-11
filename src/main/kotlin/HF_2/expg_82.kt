package org.example.HF_2

fun main() {

    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0

    while (x < 4) {
        println("${hobbits[x]} is a good Hobbit name")
        x = x + 1
    } // элементов в массиве 3 а не 5

    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemenNo = 0

    while (firemenNo < 6) {
        println("Fireman number $firemenNo is ${firemen[firemenNo]}")
        firemenNo = firemenNo + 1
    }
}