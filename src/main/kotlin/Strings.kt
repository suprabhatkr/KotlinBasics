class Strings {
    val util = Utilities()

    fun character() {
        println("===Character===")
        /*
        Special characters start from an escaping backslash \. The following escape sequences are supported:
        \t – tab
        \b – backspace
        \n – new line (LF)
        \r – carriage return (CR)
        \' – single quotation mark
        \" \" – double quotation mark
        \\ – backslash
        \$ – dollar sign
        To encode any other character, use the Unicode escape sequence syntax: '\uFF00'.
         */
        print('a')
        print('\t')
        print('b')
        print('\n')
        print('c')
        print('d')
        print('\r')
        print('e')
        print('\'')
        print('f')
        print('\"')
        print('g')
        print('\\')
        print('h')
        print('\$')
        print('\uFF00')
        println('1'.digitToInt() + '3'.digitToInt())
        val a = 'a'
        println("Type of a is $a is ${util.typeOf(a)}")
    }

    fun methods() {
        println("====Methods====")
        val a = "string"
        println("Upper case : " + a.uppercase())
        println("Original string : " + a)
        val b = "temp" + 8
        print("integer concatenation : ")
        println(b)
        val one = 1
        println("replacing value with template : $one")
        println("length of 'string' is ${a.length}")
        println("Printing dollar value ${'$'}$one")
    }

    fun literals() {
        println("===literals===")
        println("line with a new line character\n")
        println("""
            Hello,
            this is a multiline string
        """.trimIndent())
    }

    fun formatting() {
        println("===formatting===")
        // Formats an integer, adding leading zeroes to reach a length of seven characters
        val integerNumber = String.format("%07d", 31416)
        println(integerNumber)
        // 0031416

        // Formats a floating-point number to display with a + sign and four decimal places
        val floatNumber = String.format("%+.4f", 3.141592)
        println(floatNumber)
        // +3.1416

        // Formats two strings to uppercase, each taking one placeholder
        val helloString = String.format("%S %S", "hello", "world")
        println(helloString)
        // HELLO WORLD

        // Formats a negative number to be enclosed in parentheses, then repeats the same number in a different format (without parentheses) using `argument_index$`.
        val negativeNumberInParentheses = String.format("%(d means %1\$d", -31416)
        println(negativeNumberInParentheses)
        //(31416) means -31416
    }
}