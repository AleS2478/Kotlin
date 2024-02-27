fun main() {
    var value: Int? = null
    while (value == null) {
        print("Enter a positive nonzero value: ")
        val input = readLine()
        try {
            value = input?.toInt()
            if (value != null && value <= 0) {
                println("Invalid value. Please enter a positive number.")
                value = null
            }
        } catch (e: Exception) {
            println("Invalid value. Please enter a positive number.")
        }
    }
    println("You entered $value.")

    var sum = 0
    for (i in 1..value) {
        sum += i }

    println("The sum of all the integers from 1 up to $value is $sum")
}

