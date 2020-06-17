package academy.learnprogramming.inheritance


fun main(args: Array<String>) {

}
// Unlike inheritance, we don't need to declare the parent interface as open or abstract when we
// want the interface to be extendable.
interface MyInterface {
    fun myFunction(str: String) : String
    val number: Int
    // In Kotlin interfaces we can't use property initializers.
    // val number2: Int = 40
    // This is how we can explicitly set properties within an interface
    val number2: Int
    get() = 45
}

interface MySubInterface: MyInterface {
    fun mySubFunc(num: Int) : String
}

class MyInterface_Impl() : MyInterface {
    override fun myFunction(str: String): String {
        return "Hello World"
    }

    override val number: Int = 4
}


