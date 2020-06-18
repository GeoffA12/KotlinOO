package academy.learnprogramming.inheritance

import java.time.Year


fun main(args: Array<String>) {
    // Singleton reference to our object definition.
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyRightLine())
    // We need to use the companion object to access companion object attributes and class methods
    // without creating an instance of the class
}
// We can use the object declaration in kotlin to declare a singleton class that we want to ensure will
// only be run once. Notice with object declarations there's no constructors because object declarations
// will declare and initialize an instance at the same time.
object CompanyCommunications {
    // We can also use objects to extend classes or implements an interface
    val currentYear = Year.now().value
    fun getTagLine() = "Our company rocks!"
    fun getCopyRightLine() = "Copyright \u00A9 $currentYear Our Company/ All rights reserved."
}

// Demonstrating companion objects.
class SomeClass {
    private val privateVar = 6

    // It'sd not possible to access public functions and static class attributes without creating an instance
    // of the class because there's no static keyword in Kotlin like there is in Java
    fun accessPrivateVar() {
        println("I'm accessing privateVar: $privateVar")
    }
}


