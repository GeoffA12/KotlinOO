package academy.learnprogramming.accessmodifiers

fun main(args: Array<String>) {
    // The Kotlin compiler will generate an empty constructor for us like in Java
    val emp = Employee("John")
    println(emp.firstName)
    val p = Person("John")
    println(p.firstName)
    val b = Boss("John")
    println(b)
    val b2 = Boss("John", false)
    println(b2)
}

// This would be impossible in Java. But because of private access modifiers in Kotlin, where other code in this
// source file can access this class, we can declare classes as private.

// VERBOSE WAY OF DEFINING A CLASS
// Introduction to Kotlin constructors. Kotlin has the notion of a primary constructor of a class. Primary
// constructors are defined outside of the class. Secondary constructors are declared inside of the class.
class Employee constructor(firstName: String){
    val firstName: String

    // this IS NOT a constructor. This block will execute in conjunction with the primary constructor.
    // You can think of the primary constructor and the init block being a java constructor in conjunction.
    init {
        this.firstName = firstName
    }
}

// MORE VERBOSE WAY OF WRITING A CLASS WITH A CONSTRUCTOR (EQUIVALENT TO FIRST EXAMPLE)
class Person constructor(firstName: String) {
    val firstName: String = firstName
}

// EVEN MORE VERBOSE WAY (EQUIVALENT TO FIRST AND SECOND EXAMPLE)
class Boss(val firstName: String) {
    // We now have access to a class property firstName which is of type string and deonted by 'firstName'

    // add a secondary constructor. Notice that when we have a secondary constructor in kotlin, we must delegate
    // the primary constructor onto the secondary constructor. This is different than Java.
    // The syntax here is basically binding this secondary constructor onto the primary constructor with
    // the this(firstName) code.
    // Also, we can't use val and var in the secondary constructor because secondary constructors can't declare
    // properties for us in the constructor definition like they can in the primary constructor.
    var fullTime: Boolean = true
    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }
}
