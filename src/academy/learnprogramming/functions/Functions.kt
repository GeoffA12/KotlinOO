package academy.learnprogramming.functions

// Default return type for a function is a unit type. Units are basically substitutes for a void function.
// The main method can be written with a expression body here because println() isn't an expression
fun main(args: Array<String>) {
    println(labelMultiply(3, 4, "Multiply"))
    val sh = Teacher("Erin Balfour")
    println(sh.upperCaseFirstName())

    val b1 = Bus("Green", "M1", 1999)
    val b2 = Bus("Blue", "M2", 2001)
    val b3 = Bus("Red", "M4", 977)
    // In this case we'll need to use a named parameter to let the compiler know which parameter is which
    printColors(b1, b2, b3)

    val manyCars = arrayOf(b1, b2, b3)

    // Note that we can't use an array with the printColors() function do to type mismatch on parameters.
    // printColors(manyCars)
    // We can use the spread operator here to spread the values inside the array so that we can still call
    // the printColors() function with multiple buses.
    printColors(*manyCars)

    // We can make use of the spread operator anywhere where we need to unpack an array
}

fun labelMultiply(operand1: Int, operand2: Int, label: String) : String {
    return ("$label ${operand1 * operand2}")
}

// More concise way of writing the above function.
// Functions with curly braces have a block body, and functions without braces have an expression body.
// inline functions are often determined by the compiler specifically instead of us declaring them, but
// basically the inline keyword will tell the compiler to generate the function body and execute the body of
// the function in place instead of calling that function from another spot in the program.
inline fun labelMultiply2(operand1: Int, operand2: Int, label: String) = ("$label ${operand1 * operand2}")

class Teacher(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Bus(val color: String, val model: String, val year: Int) {

}

// We can functions that accept an arbitrary number of arguments by using the vararg keyword,
// similar to how we do this in java. We can only have one vararg parameter per function
fun printColors(vararg buses: Bus) {
    for (bus in buses) {
        println(bus.color)
    }
}

