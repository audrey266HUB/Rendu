import java.util.*
fun main(args: Array<String>) {
    val min = 0
    val max = 100
    var nbEssai = 0
    val hasard= SplittableRandom()
    val reader = Scanner(System.`in`)
    val goal = hasard.nextInt(min, max)
    var userTest: Int

    computerSays("J'ai choisi un nombre entre  $min et $max")
    do {
        nbEssai++
        computerSays("Quel est ton choix?")
        userTest = reader.nextInt()
        if (userTest > goal) computerSays("moins ")
        else if (userTest < goal) computerSays("plus ")
    } while(userTest != goal)

    computerSays("BRAVO ! tu as trouvé au bout de  $nbEssai tentatives.")
}

fun computerSays(text: String) {
    println("Ordinateur : " + text)
}