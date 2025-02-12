package org.example.HF_3

import java.awt.Choice

fun main() {

    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoise = getGameChoise(options)
    val userChoise = getUserChoise(options)
    printResult (userChoise, gameChoise)
}

fun getGameChoise(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoise(optionsParam: Array<String>): String {
    var isValidChoise = false
    var userChoise = " "
    while (!isValidChoise) {
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            isValidChoise = true
            userChoise = userInput
        }
        if (!isValidChoise) println("You must enter a valid choise.")
    }
    return userChoise
}

fun printResult (userChoice: String, gameChoise: String) {
    val result: String
    if (userChoice == gameChoise) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoise == "Scissors") ||
        (userChoice == "Paper" && gameChoise == "Rock") ||
        (userChoice == "Scissors" && gameChoise == "Paper")) result = "You win!"
    else result = "You lose!"
    println("You chose $userChoice. I chose $gameChoise. $result")
}