fun main(args: Array<String>) {
    print("Enter a number between 1 and 10, I will show you its roman numeral equivalent: ")

    var number = readLine()!!
    println("You entered " + number)
    var rom = number.toInt()

    if (rom == 1) {
        println("The roman numeral is I") }

    if (rom == 2) {
        println("The roman numeral is II") }

    if (rom == 3) {
        println("The roman numeral is III") }

    if (rom == 4) {
        println("The roman numeral is IV") }

    if (rom == 5) {
        println("The roman numeral is V") }

    if (rom == 6) {
        println("The roman numeral is VI") }

    if (rom == 7) {
        println("The roman numeral is VII") }

    if (rom == 8) {
        println("The roman numeral is VIII") }

    if (rom == 9) {
        println("The roman numeral is IX") }

    if (rom == 10) {
        println("The roman numeral is X") }
}