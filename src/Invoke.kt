/**
 * invoke:p310
 * @author tufei
 * @date 2018/2/16.
 */
fun main(args: Array<String>) {
    val imp = Imp()
    //这里其实是imp.invoke("新年快乐，旺旺旺旺！")的简写
    println(imp("新年快乐，旺旺旺旺！"))
}

/**
 * (String)->String
 * 相当于[Function1]这种结构的函数式接口的简明语法
 */
class Imp : (String)->String{
    override fun invoke(p1: String): String {
        return "invoke : $p1"
    }
}

interface Function1<in P,out R>{
    operator fun invoke(p:P):R
}