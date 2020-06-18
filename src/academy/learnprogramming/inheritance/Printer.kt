package academy.learnprogramming.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()

    val s1 = SomethingElse("whatever")
}
// We need to tell the compiler that we want a class to be a parent class by using the open keyword.
// This will let the class be subclassed by others. We'll need to add a primary constructor (almost always)
// if we want the class to be a parent class. We can also use the abstract keyword here
abstract class Printer(val modelName: String) {
    // When we want a function or class to be extendable or 'overriden' by children classes, we have to use
    // the open keyword.
    open fun printModel() = println("The model name of the printer is $modelName")
    abstract fun bestSellingPrices(): Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
    final override fun printModel() = println("The model name of this laser printer is $modelName")
    // Notice that even when we override abstract functions, we still need to override keyword in children classes.
    // This is because abstract functions and classes are open by default.
    override fun bestSellingPrices(): Double = 129.99
    // OVERRIDE ALSO MEANS OPEN. Children functions and classes will still be able to 'override' our
    // parent override. if we don't want this to happen we need to stick the 'final' keyword in front
    // of the override.
}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {

}

open class Something {
    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}

class SomethingElse: Something {
    constructor(someOtherParameterName: String): super(someOtherParameterName) {
        println("I'm in the child's constructor")
    }
}

// Remember that data classes are closed type. We can't super or sub class a data class, and this
// wouldn't make sense anyways.
