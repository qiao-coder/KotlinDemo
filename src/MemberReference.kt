/**
 * 成员引用(参考p114：成员引用)
 * @author tufei
 * @date 2018/2/13.
 */
fun main(args: Array<String>) {
    //效果一样
    val people = People("abc", 1)
    val kProperty0 = people::name
    println(kProperty0)
    val kProperty1 = People::name
    println(kProperty1)

    //输出结果看起来不一样  但其实效果是一样的
    val getAge1 = { people: People -> people.age }
    println(getAge1)
    val getAge2 = People::age
    println(getAge2)

    //扩展函数也可以这样引用
    val predicate = People::isAdult
    println(predicate)
}

//扩展函数
fun People.isAdult() = age >= 21

data class People(val name: String, val age: Int) : Comparable<People> {
    override fun compareTo(other: People): Int {
        //等同于compareValuesBy(this,other, { it.name }, { it.age })
        return compareValuesBy(this, other, People::age, People::name)
    }
}
