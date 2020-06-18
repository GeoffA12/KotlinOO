package academy.learnprogramming.accessmodifiers


fun main() {
    val j = Janitor("Jake", false)
    println(j.fullTime)
    j.fullTime = true
}
class Janitor(val firstName: String, fullTime: Boolean = true) {
    // Even though we declare the property outside the primary constructor here, we still get the
    // setter and getter for free.
    var fullTime = fullTime
    // When we want to define a custom accesser, it has to be defined immediately after the property
    // declaration in the class. If you have accessors for the class fields, then there will be a backing field
    // associated with the class property

    // custom accessors are the only situation in which we can use the backing identifier. We can refer
    // to the backing field by referring to the field identifier.
    get() {
        println("Running the custom get")
        // This is our custom getter method that will return us the value of the fullTime variable.
        return field
    }
    set(value) {
        println("Running the custom set")
        field = value
    }

}
