
class Numbers {

    val util = Utilities()
    fun integers() {
        println("===Integers===")
        // There are four types of Integers
        // 1. Byte (-(2^7) to (2^7 - 1))
        val oneByte: Byte = 1
        // 2. Short (-(2^15) to (2^15 - 1))
        val oneShort: Short = 1000
        // 3. Integer (-(2^31) to (2^31 - 1))
        val one = 1
        // 4. Long (-(2^63) to (2^63 - 1))
        val oneLong = 1L
        println("value of oneByte is $oneByte and its type is ${util.typeOf(oneByte)}")
        println("value of oneShort is $oneShort and its type is ${util.typeOf(oneShort)}")
        println("value of one is $one and its type is ${util.typeOf(one)}")
        println("value of oneLong is $oneLong and its type is ${util.typeOf(oneLong)}")
    }

    fun floating() {
        println("===Floating Point===")
        // Two types of floating point numbers are there
        // 1. Double (64 bits)
        val pi = 3.14
        // 2. Float (32 bits)
        val piFloat = 3.14f
        println("value of pi is $pi and its type is ${util.typeOf(pi)}")
        println("value of piFloat is $piFloat and its type is ${util.typeOf(piFloat)}")
        fun printDouble(d: Double) { print(d) }

        val i = 1
        print(util.typeOf(i))
        val d = 1.0
        println(util.typeOf(d))
        val f = 1.0f
        println(util.typeOf(f))

        printDouble(d)
        //    printDouble(i) // Error: Type mismatch
        //    printDouble(f) // Error: Type mismatch
    }

    fun literalConstant () {
        println("===literal constant===")
        /*
        Decimals: 123
        Longs are tagged by a capital L: 123L
        Hexadecimals: 0x0F
        Binaries: 0b00001011
        Doubles by default: 123.5, 123.5e10
        Floats are tagged by f or F: 123.5f
        You can use underscores to make number constants more readable:
         */
        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010

        // On JVM you have nullable number reference like Integer, Double
        val a= 9
        println(oneMillion)
        println(creditCardNumber)
        println(socialSecurityNumber)
        println(hexBytes)
        println(bytes)
        println(a)
    }

    fun typeConversion() {
        println("===type conversion===")
        // In Kotlin, if we match a long 1 with int 1, they are not same.
        // Some type conversion methods are applied on the number to convert from one type to another.
        val a = 3.14
        println(a.toInt())
        println(a.toLong())
        val b = 3
        println(b.toFloat())
        println(b.toDouble())
    }

    fun operations() {
        println("===operations===")
        println(2 + 3)
        println(8_999_000 - 3L)
        println(54.9 * 2)
        println(10.0/3)
        println(10/3)
        println(10%3)
    }

    fun bitwise() {
        println("===bitwise operations===")
        /*
        Here is the complete list of bitwise operations:
        shl(bits) – signed shift left
        shr(bits) – signed shift right
        ushr(bits) – unsigned shift right
        and(bits) – bitwise AND
        or(bits) – bitwise OR
        xor(bits) – bitwise XOR
        inv() – bitwise inversion
         */
        val x = (1 shl 2) and 0x000FF000
        println(x)
    }
}