package dlx.concrete.arithmetic

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object ADD: Instruction(
    name = "ADD",
    longname = "Add",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Arithmetic.Math),
    compactDescription = "Rd = Rs1 + Rs2",
    description = """Addiert die Zahlen in Rs1 und Rs2. Das Ergebnis wird in Rd gespeichert.""",
    usage = listOf("Mathe", "Adressberechnung", "Kopieren von Registern (mittels R0)"),
    seeAlso = listOf(Reference.immediateVersion("ADDI"))
)

object ADDI: Instruction(
    name = "ADDI",
    longname = "Add Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Arithmetic.Math),
    compactDescription = "Rd = Rs1 + Imm",
    description = """Addiert die Zahl aus Rs1 und die Zahl aus dem Immediate. Das Ergebnis wird in Rd gespeichert.""",
    usage = listOf("Mathe", "Adressberechnung", "Initialisieren von Registern (mittels R0)", "Kopieren von Registern (mittels #0)"),
    seeAlso = listOf(Reference.registerVersion("ADD"))
)