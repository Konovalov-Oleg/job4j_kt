package ru.job4j.base

fun add(first : Int, second : Int) : Int {
    return first + second
}

fun subtract(first : Int, second : Int) : Int {
    return first - second
}

fun multiply(first: Int, second: Int) : Int {
    return first * second
}

fun divide(first: Int, second: Int) : Int {
    return first / second
}

fun max(first: Int, second: Int) : Int  = if (first > second) first else second

fun max(first:Int, second: Int, third: Int): Int = if (max(first, second) > third) max(first, second) else third

fun main() {
    val plus = add(1, 1)
    println("1 + 1 = $plus")

    val minus = subtract(1, 1)
    println("1 - 1 = $minus")

    val multiply = multiply(2, 2)
    println("2 * 2 = $multiply")

    val divide = divide(5, 2)
    println("5 / 2 = $divide")

    val rsl = max(1, 2)
    println("max from 1 and 2 is $rsl")

    val max3 = max(5, 2, 6)
    println("max from 5, 2 and 6 is $max3")
}