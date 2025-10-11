package chapter3

class AccessTestClass {
    var b = 2
    public var a:Int = 1
    private var c = 3

    fun publicTest() {
        println("public 입니다")
    }

    public fun publicTest2() {
        println("public 입니다")
    }

    private fun privateTest() {
        println("private 입니다")
    }
}

fun main() {
    var accessTestClass = AccessTestClass()

    // 접근 불가
//    accessTestClass.c
//    accessTestClass.privateTest()

}