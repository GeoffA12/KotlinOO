package academy.learnprogramming.objects

import academy.learnprogramming.inheritance.SomeClass

fun main(args: Array<String>) {
    // Create an anonymous instance which implements someInterface using the object keyword
    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int) =
            // We can access local variables inside of anonymous functions, and they can be mutable or
            // immutable variables
            "This is from mustImplement ${num * 100}"
    })
}

// We use anonymous objects where we would use anonymous classes in java.
interface SomeInterface {
    fun mustImplement(num: Int) : String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(3)}")
}