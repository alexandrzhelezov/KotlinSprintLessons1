package org.example.HF_3

fun main(args: Array<String>) {

    var x = 0
    var y = 20
    for (outer in 1..3) { //1 //2
        for (inner in 4 downTo 2) { //4 //3 //2
            x = y //20 //22 //24 //24 //26 //28
            y++ //21 //23 //25 //25 //27 //29
            y++ //22 //24 //26 //26 //28 //30
            x = x + 3 //23 //25 //27 //27 //29 //31
        }
        y = y - 2 //24 //28
    }
    println("$x $y")

}