package dlx.generic

sealed class DLXTag (val names: List<String>) {


    sealed class Format(names: List<String>): DLXTag(names.map { "format:$it" }) {
        object Register: Format(listOf("register"))
        object Immediate: Format(listOf("immediate"))
        object Jump: Format(listOf("jump"))
    }

    sealed class Category(names: List<String>): DLXTag(names.map { "category:$it" }) {
        object Memory: Category(listOf("memory"))
        sealed class Arithmetic(names: List<String>): Category(names.map { "arithmetic:$it" } + listOf("arithmetic")) {
            object Math: Arithmetic(listOf("math"))
            object Comparison: Arithmetic(listOf("comparison"))
        }
        sealed class Logic(names: List<String>): Category(names.map { "logic:$it" } + listOf("logic")) {
            object Bitwise: Logic(listOf("bitwise"))
            object Shift: Logic(listOf("shift"))
        }
        sealed class Flow(names: List<String>): Category(names.map { "flow:$it" } + listOf("flow")) {
            object Jump: Flow(listOf("jump"))
            object Branch: Flow(listOf("branch"))
        }
    }
}