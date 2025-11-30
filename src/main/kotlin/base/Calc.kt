package base

fun add(first: Int, second: Int): Int {
    return first + second
}

fun subtract(first: Int, second: Int): Int {
    return first - second
}

fun multiply(first: Int, second: Int): Int {
    return first * second
}

fun divide(first: Int, second: Int): Int {
    return first / second
}

fun max(first: Int, second: Int): Int = if (first > second) first else second

fun max(first: Int, second: Int, third: Int): Int = if (max(first, second) > third) max(first, second) else third

fun draw(size: Int) {
    if (size <= 0 || size % 2 == 0) return
    for (x in 1..size) {
        for (y in 1..size) {
            if (x == y || size + 1 == x + y) print('x') else print(' ')
        }
        println()
    }
}

fun defragment(array: Array<String?>) {
    var lastIndexWithValue = -1
    for ((index, name) in array.withIndex()) {
        if (name != null) {
            val tmp = array[index]
            array[index] = null
            array[++lastIndexWithValue] = tmp
        }
    }
}

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

    draw(11)

    val names = arrayOfNulls<String>(10)
    names[1] = "Oleg"
    defragment(names)
    println("Name First: ${names.first()}")
}
