package dlx.generic

enum class DLXFormat(val defaultArgTypes: List<DLXArgtype>) {
    REGISTER(listOf(DLXArgtype.REGISTER, DLXArgtype.REGISTER, DLXArgtype.REGISTER)),
    IMMEDIATE(listOf(DLXArgtype.REGISTER, DLXArgtype.REGISTER, DLXArgtype.IMMEDIATE)),
    JUMP(listOf(DLXArgtype.JUMP_LABEL))
}