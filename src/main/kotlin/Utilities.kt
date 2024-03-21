class Utilities {
    fun typeOf(element: Any?): String {
        return when (element) {
            is String -> "String"
            is Int -> "Int"
            is Long -> "Long"
            is Float -> "Float"
            is Double -> "Double"
            is Char -> "Char"
            is Boolean -> "Boolean"
            is Array<*> -> "Array"
            is List<*> -> "List"
            is Map<*, *> -> "Map"
            is Set<*> -> "Set"
            else -> {
                if (element != null && element.javaClass.isArray) {
                    val componentType = element.javaClass.componentType
                    "Array<${componentType.simpleName}>"
                } else if (element == null) {
                    "NULL"
                } else {
                    element.javaClass.simpleName
                }
            }
        }
    }
}