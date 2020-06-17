package academy.learnprogramming.accessmodifiers

// We can declare top-level constants outside of classes unlike in Java
val MY_CONSTANT = 100

fun main(args: Array<String>) {
    println(MY_CONSTANT)
    println(Car("Blue", "Toyota", 2015).toString())
    val c1 = Car("Blue", "Toyota", 2015)
    val c2 = Car("Blue", "Toyota", 2015)
    println(c1 == c2)
    println(c1 === c2)
    val c3 = c1.copy()
    println(c3)
    val c4 = c1.copy(year=2016)
    println(c4)
}

// Data classes are used when we only need a class to sit and store data or fields that we can use in
// other parts of the program. Data classes come with a built-in toString() method, implmentation of the
// hashCode and equals() and copy() methods. We can still override the toString implementation using the
// override keyword. Data classes can't be sealed or abstract classes.
data class Car(val color: String, val model: String, val year: Int) {

}
