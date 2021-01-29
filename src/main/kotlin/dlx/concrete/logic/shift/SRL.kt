package dlx.concrete.logic.shift

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object SRL: Instruction(
    name = "SRL",
    longname = "Shift Right Logical",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Logic.Shift),
    compactDescription = "Rd = Rs1 >>> (Rs2 % 32)",
    description = """Schiebt die Bit der Zahl in Rs1 um Rs2 (modulo 32) Stellen nach rechts. Es wird mit 0 aufgefüllt. Das Ergebnis wird in Rd gespeichert.
    """.trimMargin(),
    warning = """Da um Rs2 modulo 32 verschoben wird, entspricht ein Rechts Shift um 32 einem Rechts Shift um 0.
        |Eignet sich nicht zur Division, hierzu siehe SRA.
    """.trimMargin(),
    usage = listOf("Verschieben von Bit"),
    seeAlso = listOf(Reference.immediateVersion("SRLI"), Reference.arithmeticVersion("SRA"))
)

object SRLI: Instruction(
    name = "SRLI",
    longname = "Shift Right Logical Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Logic.Shift),
    compactDescription = "Rd = Rs1 >>> (Imm % 32)",
    description = """Schiebt die Bit der Zahl in Rs1 um Imm (modulo 32) Stellen nach rechts. Es wird mit 0 aufgefüllt. Das Ergebnis wird in Rd gespeichert.
    """.trimMargin(),
    warning = """Da um Imm modulo 32 verschoben wird, entspricht ein Rechts Shift um 32 einem Rechts Shift um 0.
        |Eignet sich nicht zur Division, hierzu siehe SRA.
    """.trimMargin(),
    usage = listOf("Verschieben von Bit"),
    seeAlso = listOf(Reference.registerVersion("SRL"), Reference.arithmeticVersion("SRAI"))
)