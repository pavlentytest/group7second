
fun main(args: Array<String>) {

    //println(test(5,6))
    val x : () -> Unit = { println("Hello") }
    x()
    val x1 = { println("Hello") }

    val y : (String) -> Unit = { message: String -> println(message) }
    y("Test")

    val z = {x: Int, y: Int -> val r = x+y; println(r)}

    val z2 = {x: Int, y: Int ->
        val r = x+y
        println(r)
    }

    val z3 = {x: Int, y: Int ->
        val f = 100+1000*(x+y)
        f
    }
    // передача лямбда функции в другую функцию
    doOperation(3,4, {q: Int, w: Int -> q*q*w*w})
    doOperation(3,4) { q: Int, w: Int -> q * q * w * w }
    doOperation { i, i2 -> i*i2 }
    doOperation (op = z3)
    // передаем анонимную функцию
    doOperation(5,6, fun(x: Int, y: Int) = x*x*3)

    val p = fun() = println("hhhh")
    p()

    val r = bigFun(1)
    println(r(1,1))
}
fun bigFun(k: Int) : (Int, Int) -> Int {
    when(k) {
        1 -> return fun(x: Int, y: Int) = x*y*900
        2 -> return {x: Int, y:Int -> x+y*x*y}
        else -> return fun(x: Int, y: Int) = 0
    }
}



fun doOperation(x: Int = 2, y: Int = 3, op: (Int, Int) -> Int) {
    println(op(x,y))
}


fun test(a: Int, b: Int) {

}