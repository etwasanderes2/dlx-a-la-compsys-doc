package dlx.concrete.arithmetic

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object MULT: Instruction(
    name = "MULT",
    longname = "Multiply",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Arithmetic.Math),
    compactDescription = "Rd = Rs1 * Rs2",
    description = """Multipliziere die Zahlen in Rs1 und Rs2. Das Ergebnis wird in Rd gespeichert.""",
    warning = """Häufig in Hausaufgaben verboten, weil es Dinge zu einfach macht.
        |Es existiert keine Immediate Version.
    """.trimMargin(),
    usage = listOf("Mathe"),
)