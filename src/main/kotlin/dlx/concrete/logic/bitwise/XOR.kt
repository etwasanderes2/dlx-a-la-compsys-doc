package dlx.concrete.logic.bitwise

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object XOR: Instruction(
    name = "XOR",
    longname = "Exklusiv Oder",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Logic.Bitwise),
    compactDescription = "Rd = Rs1 ^ Rs2",
    description = """Wendet die XOR Operation auf die Zahlen in Rs1 und Rs2 bitweise an. Das Ergebnis wird in Rd gespeichert.""",
    usage = listOf("Logik", "\"Flippen\" von bit", "Tausch zweier Registerwerte ohne Hilfsregister", "Kopieren von Registern (mittels R0)"),
    seeAlso = listOf(Reference.immediateVersion("XORI"))
)

object XORI: Instruction(
    name = "XORI",
    longname = "Exklusiv Oder Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Logic.Bitwise),
    compactDescription = "Rd = Rs1 ^ Imm",
    description = """Wendet die XOR Operation auf die Zahl aus Rs1 und die Zahl aus dem Immediate bitweise an. Das Ergebnis wird in Rd gespeichert.""",
    warning = """Das Immediate wird signed-extendet, also sind bei negativen Zahlen die oberen 16 bit alle 1""",
    usage = listOf("Logik", "\"Flippen\" von bit", "Bitweises NOT (mittels #-1)", "Initialisieren von Registern (mittels R0)", "Kopieren von Registern (mittels #0)"),
    seeAlso = listOf(Reference.registerVersion("XOR"))
)