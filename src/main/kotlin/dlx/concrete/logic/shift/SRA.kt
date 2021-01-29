package dlx.concrete.logic.shift

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object SRA: Instruction(
    name = "SRA",
    longname = "Shift Right Arithmetic",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Logic.Shift),
    compactDescription = "Rd = Rs1 >> (Rs2 % 32)",
    description = """Schiebt die Bit der Zahl in Rs1 um Rs2 (modulo 32) Stellen nach rechts. Es wird mit dem MSB von Rs1 aufgefüllt. Das Ergebnis wird in Rd gespeichert.
    """.trimMargin(),
    warning = """Da um Rs2 modulo 32 verschoben wird, entspricht ein Rechts Shift um 32 einem Rechts Shift um 0.""",
    usage = listOf("Division mit 2^Rs2"),
    seeAlso = listOf(Reference.immediateVersion("SRAI"), Reference.logicalVersion("SRL"))
)

object SRAI: Instruction(
    name = "SRAI",
    longname = "Shift Right Arithmetic Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Logic.Shift),
    compactDescription = "Rd = Rs1 >> (Imm % 32)",
    description = """Schiebt die Bit der Zahl in Rs1 um Imm (modulo 32) Stellen nach rechts. Es wird mit dem MSB von Rs1 aufgefüllt. Das Ergebnis wird in Rd gespeichert.
    """.trimMargin(),
    warning = """Da um Imm modulo 32 verschoben wird, entspricht ein Rechts Shift um 32 einem Rechts Shift um 0.""",
    usage = listOf("Division mit 2^Imm"),
    seeAlso = listOf(Reference.registerVersion("SRA"), Reference.logicalVersion("SRLI"))
)