/**
 * @author tufei
 * @date 2018/2/8.
 */
fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is : $oldest")

    println("-------------------------------")

    //解构
    val ints = arrayOf(1, 2, 3)
    val list = listOf(0, *ints)
    println(list)

    println("-------------------------------")

    //filter
    println(listOf(1, 2, 3, 4).filter { it % 2 == 0 })
    println(listOf(Person("Alice", 29), Person("Bob", 31)).filter {
        if (it.age != null) {
            it.age > 30
        } else {
            false
        }
    })

    //map
    println(listOf(1, 2, 3, 4).map { it * it; })
    println(listOf(Person("Alice", 29), Person("Bob", 31)).map { it.name })

    println("-------------------------------")

    //all
    println(listOf(Person("Alice", 29), Person("Bob", 31)).all { it.name.startsWith("A") })
    //any
    println(listOf(Person("Alice", 29), Person("Bob", 31)).any { it.name.startsWith("A") })
    //count
    println(listOf(Person("Alice", 29), Person("Bob", 31)).count { it.name.startsWith("A") })
    //虽然下面也可以获得count同样的效果，但要创建一个中间集合，没那么高效
    println(listOf(Person("Alice", 29), Person("Bob", 31)).filter { it.name.startsWith("A") }.size)

    println("-------------------------------")

    //find:多个匹配就返回第一个，都没有就返回null
    println(listOf(Person("Alice", 29), Person("Bob", 31)).find { it.name.startsWith("A") })
    //等同于firstOrNull
    println(listOf(Person("Alice", 29), Person("Bob", 31)).firstOrNull { it.name.startsWith("A") })

    println("-------------------------------")

    //groupBy:下面的返回值是Map<Int,List<Person>>
    println(listOf(Person("Alice", 29), Person("Bob", 31), Person("Carol", 31)).groupBy { it.age })

    println("-------------------------------")

    val strings = listOf("abc", "def")
    println(strings.map { it.toList() })
    println(strings.flatMap { it.toList() })
}

data class Person(val name: String, val age: Int? = null)