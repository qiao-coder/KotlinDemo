/**
 * invoke:p310
 * @author tufei
 * @date 2018/2/16.
 */
fun main(args: Array<String>) {
    val imp = Imp()
    //这里其实是imp.invoke("新年快乐，旺旺旺旺！")的简写
    println(imp("新年快乐，旺旺旺旺！"))

    //Imp2本身就是一个函数类型
    //注意函数类型((String)->Unit)和扩展函数类型,即带接收者的函数类型(String.()->Unit)的区别
    val imp2 = Imp2()
    listOf("abc").filter(imp2)
}

/**
 * (String)->String
 * 相当于[Function1]这种结构的函数式接口的简明语法
 */
class Imp : (String)->String{
    override fun invoke(p1: String): String {
        return "Imp : invoke : $p1"
    }
}
class Imp2 : (String)->Boolean{
    override fun invoke(p1: String): Boolean {
        println("Imp2 : invoke : $p1")
        return true
    }
}

interface Function1<in P,out R>{
    operator fun invoke(p:P):R
}