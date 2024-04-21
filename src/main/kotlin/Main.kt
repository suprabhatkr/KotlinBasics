import suprabhatkumar.Message as msg
import suprabhatkumar.*
fun main() {
    println("Programs Below")

    val numbers = Numbers()
    val boolean = Boolean()
    val string = Strings()
    val array = ArrayClass()
    val conditions = Conditions()
    val loops = Loops()
    val returnBreak = ReturnBreak()
    val exceptions = Exceptions()

    numbers.integers()
    numbers.floating()
    numbers.literalConstant()
    numbers.typeConversion()
    numbers.operations()
    numbers.bitwise()
    numbers.uSignedIntegers()

    boolean.primitiveBoolean()
    boolean.latestBoolean()

    string.character()
    string.methods()
    string.literals()
    string.formatting()

    array.declaration()
    array.accessing()
    array.methods()
    array.convertArray()
    array.mutableList()

    conditions.ifElse()
    conditions.whenCondition()

    loops.forLoop()
    loops.whileLoop()

    returnBreak.breakUses()
    returnBreak.returnUses()

    exceptions.catchException()
    exceptions.nothingArgument()

    printMessage()
    msg.printMessage()
}
