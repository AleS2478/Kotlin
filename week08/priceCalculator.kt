import java.util.Scanner

fun main() {
    val scanner = Scanner(System. `in`)
    println("Enter the item's wholesale cost: ")
    val wholesaleCost = scanner. nextDouble()
    println("Enter the markup percentage: ")
    val markupPercentage = scanner.nextDouble()

    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaCost: Double, markupPercentage: Double): Double {
    val markupAmount = wholesaCost * markupPercentage / 100
    return wholesaCost + markupAmount
}