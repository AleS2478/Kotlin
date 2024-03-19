import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(0, 101)
    var guess: Int?
    var attempts = 0

    println("Guess the number generated")

    do {
        print("Enter your guess:")
        guess = readLine()!!.toIntOrNull()

        if (guess != null) {
            attempts++

            when {
                guess < randomNumber -> println("Too low, try again.")
                guess > randomNumber -> println("Too high, try again.")
                else -> println("Congratulations! You guessed the number $randomNumber correctly in $attempts attempts.")
            }
        } else {
            println("Please enter a valid number")
        }
    }  while (guess != randomNumber)
}