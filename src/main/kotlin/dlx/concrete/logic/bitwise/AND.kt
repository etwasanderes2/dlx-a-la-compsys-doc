package dlx.concrete.logic.bitwise

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object AND: Instruction(
    name = "AND",
    longname = "And",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Logic.Bitwise),
    compactDescription = "Rd = Rs1 & Rs2",
    description = """Ver-UND-et die Zahlen in Rs1 und Rs2 bitweise. Das Ergebnis wird in Rd gespeichert.""",
    usage = listOf("Logik", "Maskierung", "Setzten von bit auf 0"),
    seeAlso = listOf(Reference.immediateVersion("ANDI"))
)

object ANDI: Instruction(
    name = "ANDI",
    longname = "And Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Logic.Bitwise),
    compactDescription = "Rd = Rs1 & Imm",
    description = """Ver-UND-et die Zahl aus Rs1 und die Zahl aus dem Immediate. Das Ergebnis wird in Rd gespeichert.""",
    warning = """Das Immediate wird signed-extendet, also sind bei negativen Zahlen die oberen 16 bit alle 1""",
    usage = listOf("Logik", "Maskierung", "Setzten von bit auf 0"),
    seeAlso = listOf(Reference.registerVersion("AND"))
)