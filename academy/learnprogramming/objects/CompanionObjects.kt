package academy.learnprogramming.objects


fun main(args: Array<String>) {
    println(Class1.Companion.accessPrivateVar())

    val someClass = Class2.justAssign("this is the string as is")
    val someClass2 = Class2.upperOrLowerCase("this isn't the string as is", false)
    println(someClass.someString)
    println(someClass.someString)
}

class Class1 {
    // Syntax to declare companion objects in Kotlin, giving us access to class attributes and
    // methods without declaring an instance of the class
    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"
    }
}

// We can use companion objects in kotlin to act as an instance factory as well.
// Now that our constructor is private here, it will not be accessible from outside the class.
// The only way we can get access to methods and attributes in this class is to use a companion object
// with justAssign() or upperOrLowerCase()
class Class2 private constructor(val someString: String) {
    companion object {
        private var privateVar = 6
        fun accessPrivateVar() = "i'm accessing privateVar: $privateVar"
        fun justAssign(str: String) = Class2(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean) : Class2 {
            if (lowerCase) {
                return Class2(str.toLowerCase())
            }
            else {
                return Class2(str.toUpperCase())
            }
        }
    }
}