/**
 * 幕后
 *
 * @author tufei
 * @date 2018/1/13.
 */
class Backstage(list: List<String>) {
    var strings: List<String> = list
        set(a) {
            field = a
            println(strings)
        }
}

fun main(args: Array<String>) {
    val backstage = Backstage(mutableListOf("a", "b"))
    backstage.strings = mutableListOf("c", "d")
}