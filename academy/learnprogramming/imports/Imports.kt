package academy.learnprogramming.imports
// Notice how we can use import shortcuts here
import academy.learnprogramming.functions.labelMultiply as lm

// Our kotlin packages don't have to match the directory file structure like it does in Java.
// IntelliJ has a setting that lets us auto-import classes, enums, and functions from the same module.
// How to import from another module in IntelliJ:
/*
1. Right click on module name
2. Make sure you select open module settings
3. Click on the module name you want to add a dependency to
4. Click on the dependency tab
5. Click on the plus icon
6. Add the module dependency
7. apply and save
 */
fun main(args: Array<String>) {
    lm(3, 4, "The answer is: ")
}
