//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите слова через пробел: ")
    val words = readln().split(" ")
    val groups = mutableMapOf<String, MutableList<String>>()
    for (word in words) {
        val key = word.toCharArray().sorted().joinToString("")
        if (!groups.containsKey(key)) {
            groups[key] = mutableListOf()
        }
        groups[key]!!.add(word)
    }
    for (key in groups.keys) {
        var list = ""
        for (word in groups[key]!!) {
            list += "\"$word\" "
        }
        println(list)
    }
}