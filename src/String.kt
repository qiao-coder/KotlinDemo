/**
 * @author tufei
 * @date 2018/2/8.
 */
fun main(args: Array<String>) {
    println("12.345-6.A".split("."))
    println("12.345-6.A".split(".".toRegex()))
    println("12.345-6.A".split("\\.|-"))
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split("""[.\-]""".toRegex()))

    parsePath("file:///D:/书籍/ThinkInJava/Java4.pdf")

    val kotlinLogo = """
        .| //
        .|//
        .|/ \
    """
    println(kotlinLogo.trimMargin("."))
}

fun parsePath(path:String){
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult!=null){
        val (directory,filename,extension) = matchResult.destructured
        println("Dir:$directory,name:$filename,ext:$extension")
    }
}