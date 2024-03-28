fun main() {
    val pyramidLevel = readLine()?.toIntOrNull() ?:0

    for(i in 1..pyramidLevel) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }
}