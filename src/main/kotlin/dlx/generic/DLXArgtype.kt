package dlx.generic

enum class DLXArgtype(val symbol: String, val cssClass: String = "ch_$symbol") {
    REGISTER("register"),
    IMMEDIATE("immediate"),
    MEM_ADDRESS("address"),
    JUMP_LABEL("label")
}