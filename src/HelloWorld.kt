/**
 * @author tufei
 * @date 2017/11/2.
 */

val PI = 3.14
var y = 0
fun main(args: Array<String>) {
    println("HelloWorld")

    print("sum of 3 and 5 is ")
    println(sum1(3, 5))

    println("sum of 19 and 23 is ${sum2(19, 23)}")

    printSum1(-1, 8)

    printSum2(-1, 8)

    //Assign-once (read-only) local variable:
    val a: Int = 1 //immediate assignment
    val b = 2 //`Int` type is inferred
    val c: Int // Type required when no initializer is provided
    c = 3 //deferred assignment
    println("a = $a,b = $b,c = $c")

    //Mutable variable:
    var x = 5 // `Int` type is inferred
    x += 1
    println("x = $x")

    //Top-level variables:
    println("y = $y; PI = $PI")
    incrementY()
    println("incrementY()")
    println("y = $y; PI = $PI")

}

//Function having two Int parameters with Int return type:
fun sum1(a: Int, b: Int): Int {
    return a + b
}

//Function with an expression body and inferred return type:
fun sum2(a: Int, b: Int) = a + b

fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}");
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun incrementY() {
    y += 1
}