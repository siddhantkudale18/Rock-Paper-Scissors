package com.example.rockpaperscissor

fun main(){

    var computerChoice = ""
    var userChoice = ""
    println("Rock, Paper or Scissors? Enter your choice! ")
    print("User Choice: ")
    userChoice = readln()

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println("Computer Choice: " + computerChoice)

    val winner = when {
        userChoice == computerChoice -> "Tie"
        userChoice == "Rock" && computerChoice == "Scissors" -> "User"
        userChoice == "Paper" && computerChoice == "Rock" -> "User"
        userChoice == "Scissors" && computerChoice == "Paper" -> "User"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("It's a tie.")
    }
    else if(winner == "User"){
        println("User won!")
    }
    else{
        println("Computer won!")
    }


}