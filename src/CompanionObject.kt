/**
 * @author tufei
 * @date 2018/2/9.
 */
var i = 0

class User {

    companion object {
        val name: String = "今晚打老虎"
        @JvmField
        val age: Int = 25
        @JvmStatic
        val password: String = "123"

        init {
            i++
        }

        fun method() {
            println("method")
        }

        @JvmStatic
        fun methodWithJvmStatic() {
            println("methodWithJvmStatic")
        }
    }
}

fun main(args: Array<String>) {
    //@JvmStatic是为了与Java的互操作性存在的
    //如果使用纯粹的kotlin写代码，不考虑互操作性，没有使用这个注释的必要
    //下面看起来  就像在Java中使用静态字段
    println(User.name)
    println(User.password)

    User()
    User()
    //输出1，伴生对象是针对类而已的，只有一个
    println(i)
}