package com.tufei.todo.tasks

/**
 * @author tufei
 * @date 2018/1/5.
 */
fun MutableList<Int>.swap(i1: Int, i2: Int) {
    val temp = this[0]
    this[0] = this[1]
    this[1] = temp
}


fun main(args: Array<String>) {
    val list = mutableListOf(1, 2, 3)
    list.swap(1,2)
    println(list)
}