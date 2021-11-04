fun main() {
    val list = mutableListOf<Int>()
    while (true) {
        var input = readLine()!!
        if (input == "END") break
        var int = input.toInt()
        list += int
    }
    println(list.size)
    println(list)
}