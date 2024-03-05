fun main() {
    var sales = IntArray(5)

    for (i in 0..4) {
        print("Enter today's sales for stores ${i+1}: ")
        sales[i] = readLine()?.toInt() ?:0
    }

    println("\nSALES BAR CHART")
    for (i in 0..4 ) {
        print("Store ${i+1}:")
        repeat(sales[i] / 100) {
            print("*")
        }
        println()
    }
}