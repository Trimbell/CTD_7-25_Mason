package Other

class Rectangle(var width: Int, var height: Int) {
    val isSquare: Boolean
        get() = width == height
    val area: Int
        get() = width * height
}

fun main() {
    val r = arrayOf(
        Rectangle(1, 1), Rectangle(1, 1),
        Rectangle(1, 1), Rectangle(1, 1)
    )
    for (x in r.indices) {
        r[x].width = (x + 1) * 3
        r[x].height = x + 5
        print("Other.Rectangle $x has area ${r[x].area}. ")
        println("It is ${if (r[x].isSquare) "" else "not "}a square")
    }
}