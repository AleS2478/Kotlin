const val HERO_NAME = "Madrigal"

fun main() {
    //println("Hello, world!")
    //println("My name is Alejandro, and I'm learning Kotlin")
    println("The hero announces her presence to the World.")

    println(HERO_NAME)
    
    var playerLevel = 4
    println(playerLevel)

    val hasBefriendedBarbarians: Boolean = true
    if (playerLevel == 1) {
        println("Meet Mr. Bubbles in the land of the soft things.") }
    else if (playerLevel <= 5) {
        if (hasBefriendedBarbarians) {
        println("Convince barbarians to call off their invasion.") }
        else {
        println("Save the town from the barbarian invasion.") }
    }
    else if (playerLevel == 6) {
        println("Locate the enchanted sword.") }
    else if (playerLevel == 7) {
        println("Recover the long-lost artifact of creation.") }
    else if (playerLevel == 8) {
        println("Defeat Nogartse, bringer of death and eater of worlds.") }
    else {
        println("There are no quests right now.") }

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel += 1
    println(playerLevel)

    val hasSteed: Boolean = true
    println(hasSteed)
}