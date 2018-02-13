/**
 * @author tufei
 * @date 2017/11/2.
 */
fun main(args:Array<String>){

//    Using string templates
    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

//    Using conditional expressions
    println("max of 0 and 42 is ${maxOf1(0, 42)}")
    //Using if as an expression:
    println("max of 0 and 42 is ${maxOf2(0, 42)}")

//    Using nullable values and checking for null
//
//    A reference must be explicitly marked as nullable when null value is possible.
//
//    Return null if str does not hold an integer:
//
//    fun parseInt(str: String): Int? {
//        // ...
//    }
    printProduct1("6", "7")
    printProduct1("a", "7")
    printProduct1("a", "b")

    printProduct2("6", "7")
    printProduct2("a", "7")
    printProduct2("99", "b")
}


fun maxOf1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun parseInt1(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct1(arg1: String, arg2: String) {
    val x = parseInt1(arg1)
    val y = parseInt1(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}


fun parseInt2(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt2(arg1)
    val y = parseInt2(arg2)

    // ...
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // x and y are automatically cast to non-nullable after null check
    println(x * y)
}