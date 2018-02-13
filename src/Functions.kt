
import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * @author tufei
 * @date 2017/11/2.
 */
fun main(args: Array<String>) {
//    Array<Byte> is equivalent to java's Byte[] (the boxed byte). If you want primitive byte array, use ByteArray.
//    val bytes = Array<Byte>(1024)
    val bytes = ByteArray(1024)
    read(bytes)

    //不知道这是什么
//    val stringArray = StringArray()
//    stringArray.add("哈哈")
//    stringArray.add("嘻嘻")
//    read(stringArray)

    //double数组
    var double_array = doubleArrayOf(1.0, 2.0, 3.0)
    //String数组
    var string_array = arrayOf("东", "南", "西", "北")

//    Default Arguments
    //If a default parameter precedes a parameter with no default value,
    //the default value can be used only by calling the function with named arguments:
    // The default value bar = 0 is used
    foo(baz = 1)

    //But if a last argument lambda is passed to a function call outside the parentheses,
    //passing no values for the default parameters is allowed:
    foo(1) { println("hello") } // Uses the default value baz = 1
    foo { println("hello") }    // Uses both default values bar = 0 and baz = 1

    //we could call this using default arguments:
    reformat(str = "tufei")
    reformat("tufei")
    //and if we do not need all arguments:
    reformat(str = "qiao",divideByCamelHumps = true,wordSeparator = '0')
    //However, when calling it with non-default, the call would look something like:
    reformat("haha", true, true, false, '_')

    foo(strings = *arrayOf("a", "b", "c"))
    foo(strings = "a") // Not required for a single value

    val list = asList(1, 2, 3)
}

fun read(b: ByteArray, off: Int = 0, len: Int = b.size) {
    println("b = $b")
    println("off = $off")
    println("len = $len")
}

fun read(a: StringArray, len: Int = a.size) {
    println("a = ${a.get(0)}")
    println("len = $len")
}


open class A {
    open fun foo(i: Int = 10) {}
}

class B : A() {
    override fun foo(i: Int) {}  // no default value allowed
}

fun foo(bar: Int = 0, baz: Int) {}

fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {}

fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
    println("reformat invoked")
    println("str = $str , nomalizeCase = $normalizeCase , upperCaseFirstLetter = $upperCaseFirstLetter , " +
            "divideByCamelHumps = $divideByCamelHumps , wordSeparator = $wordSeparator")
}


fun foo(vararg strings: String) {
    for (str in strings){
        print(str+" ")
    }
    println()
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}