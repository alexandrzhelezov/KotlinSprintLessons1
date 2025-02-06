package org.example.lesson_5

const val VALID_LOGIN = "Zaphod"
const val VALID_PASSWORD = "PanGalactic"

fun main() {

    println(
        """|Внимание, пассажир. 
        |Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля 'Heart of Gold'.
        |[вздыхает...]""".trimMargin()
    )
    Thread.sleep(5000)

    println(
        """|Что ж, введи, пожалуйста, свое имя пользователя,чтобы мы могли приступить к процессу входа.
        |Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.
        |[вздыхает ещё глубже...]""".trimMargin()
    )
    Thread.sleep(5000)

    println("Да, вперед, пожалуйста, вводите свои данные...(логин)")
    val userLogin = readln().toString()

    if (userLogin != VALID_LOGIN) {
        println("Пользователь не найден, пожалуйста зарегистрируйтесь")
        return
    }

    println("Пожалуйста введите пароль:")
    val userPassword = readln().toString()

    if (userPassword != VALID_PASSWORD) {
        println("Вы ввели неверный пароль")
    } else {
        println("[вздыхает...]")
        Thread.sleep(5000)
        println("Ваши данные проверены, и о, чудо, они верны...")
        Thread.sleep(1000)
        println("Пользователь 'Zaphod', вам разрешено входить на борт корабля 'Heart of Gold'.")
        Thread.sleep(1000)
        println("Хотя мне всё равно...")
        Thread.sleep(1000)
        println("Ну вперед, войдите...")
        Thread.sleep(1000)
        println("Если вам так уж надо, в конце концов... [меланхолический вздох...]")
        Thread.sleep(1000)
        println("Надеюсь, вам понравится пребывание здесь больше, чем мне.")
    }

}