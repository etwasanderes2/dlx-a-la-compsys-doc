package dlx.concrete.arithmetic

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object SUB: Instruction(
    name = "SUB",
    longname = "Subtract",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Arithmetic.Math),
    compactDescription = "Rd = Rs1 - Rs2",
    description = """Subtrahiert die Zahl in Rs2 von der in Rs1. Das Ergebnis wird in Rd gespeichert.""",
    usage = listOf("Mathe", "Adressberechnung", "Negieren von Registern (mittels Rs1 = R0)", "Kopieren von Registern (mittels Rs2 = R0)"),
    seeAlso = listOf(Reference.immediateVersion("SUBI"))
)

object SUBI: Instruction(
    name = "SUBI",
    longname = "Subtract Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Arithmetic.Math),
    compactDescription = "Rd = Rs1 - Imm",
    description = """Subtrahiert die Zahl im Immediate von der in Rs1. Das Ergebnis wird in Rd gespeichert.
        |Um Immediate minus Register zu rechnen, negiere das Resultat dieses Befehls.
    """.trimMargin(),
    usage = listOf("Mathe", "Adressberechnung", "Kopieren von Registern (mittels #0)", "Initialisieren von Registern auf bis zu 32768"),
    seeAlso = listOf(Reference.registerVersion("SUB"))
)