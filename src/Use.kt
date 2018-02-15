import java.io.BufferedReader
import java.io.FileReader

/**
 * use:使用use函数作为资源管理（就像java7以后的try-with-resource）
 * @author tufei
 * @date 2018/2/15.
 */
fun main(args: Array<String>) {
    val firstLine= readFirstFromFile("D:\\idea\\KotlinDemo\\src\\Use.kt")
    println(firstLine)
}

fun readFirstFromFile(path: String): String {
    //看源码可以发现，使用use时，异常还是会被抛出来，
    //但无论是否遇到异常，资源都会被关闭
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}
