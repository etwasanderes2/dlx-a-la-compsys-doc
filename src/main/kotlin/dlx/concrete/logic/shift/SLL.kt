package dlx.concrete.logic.shift

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object SLL: Instruction(
    name = "SLL",
    longname = "Shift Left Logical",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Logic.Shift),
    compactDescription = "Rd = Rs1 << (Rs2 % 32)",
    description = """Schiebt die Bit der Zahl in Rs1 um Rs2 (modulo 32) Stellen nach links. Es wird mit 0 aufgefüllt. Das Ergebnis wird in Rd gespeichert.
        |Ein Arithmetischer Links Shift existiert nicht, da er das Gleiche wäre wie der Logische.
    """.trimMargin(),
    warning = """Da um Rs2 modulo 32 verschoben wird, entspricht ein Links Shift um 32 einem Links Shift um 0.""",
    usage = listOf("Verschieben von Bit", "Multiplikation mit 2^Rs2"),
    seeAlso = listOf(Reference.immediateVersion("SLLI"))
)

object SLLI: Instruction(
    name = "SLLI",
    longname = "Shift Left Logical Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Logic.Shift),
    compactDescription = "Rd = Rs1 << (Imm % 32)",
    description = """Schiebt die Bit der Zahl in Rs1 um Imm (modulo 32) Stellen nach links. Es wird mit 0 aufgefüllt. Das Ergebnis wird in Rd gespeichert.
        |Ein Arithmetischer Links Shift existiert nicht, da er das Gleiche wäre wie der Logische.
    """.trimMargin(),
    warning = """Da um Imm modulo 32 verschoben wird, entspricht ein Links Shift um 32 einem Links Shift um 0.""",
    usage = listOf("Verschieben von Bit", "Multiplikation mit 2^Imm"),
    seeAlso = listOf(Reference.registerVersion("SLL"))
)