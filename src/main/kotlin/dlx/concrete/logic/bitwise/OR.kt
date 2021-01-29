package dlx.concrete.logic.bitwise

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object OR: Instruction(
    name = "OR",
    longname = "Or",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Logic.Bitwise),
    compactDescription = "Rd = Rs1 | Rs2",
    description = """Ver-ODER-t die Zahlen in Rs1 und Rs2 bitweise. Das Ergebnis wird in Rd gespeichert.""",
    usage = listOf("Logik", "Zusammenbauen von maskierten Schnipseln", "Setzten von bit auf 1", "Kopieren von Registern (mittels R0)"),
    seeAlso = listOf(Reference.immediateVersion("ORI"))
)

object ORI: Instruction(
    name = "ORI",
    longname = "OR Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Logic.Bitwise),
    compactDescription = "Rd = Rs1 | Imm",
    description = """Ver-ODER-t die Zahl aus Rs1 und die Zahl aus dem Immediate. Das Ergebnis wird in Rd gespeichert.""",
    warning = """Das Immediate wird signed-extendet, also sind bei negativen Zahlen die oberen 16 bit alle 1""",
    usage = listOf("Logik", "Zusammenbauen von maskierten Schnipseln", "Setzten von bit auf 0", "Initialisieren von Registern (mittels R0)", "Kopieren von Registern (mittels #0)"),
    seeAlso = listOf(Reference.registerVersion("OR"))
)