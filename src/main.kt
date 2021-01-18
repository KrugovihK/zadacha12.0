import kotlin.math.*
fun main()
{
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    var h = a*a+b*b
    var c = sqrt(h.toDouble())
    var p = a+b+c
    println(c)
    println(p)
}