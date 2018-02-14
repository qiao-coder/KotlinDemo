/**
 * 委托属性(参考p93、p195~202)
 * @author tufei
 * @date 2018/2/14.
 */
fun main(args: Array<String>) {
    val man = Man("Alice")
    println("Initialization Succeed")
    //第一次调用的时候，才会执行lazy后面的语句
    man.emails
}

class Email

class Man(val name: String) {
    val emails by lazy { loadEmails(this)}

    private fun loadEmails(man: Man): List<Email> {
        println("Load emails for ${man.name}")
        return listOf(Email())
    }
}

