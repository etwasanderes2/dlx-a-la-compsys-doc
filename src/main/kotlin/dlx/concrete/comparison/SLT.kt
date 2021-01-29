package dlx.concrete.comparison

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object SLT: Instruction(
    name = "SLT",
    longname = "Set if Less Than",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Arithmetic.Comparison),
    compactDescription = "Rd = if (Rs1 < Rs2) then (1) else (0)",
    description = """Setzt Rd auf 1, wenn Rs1 echt kleiner Rs2 ist. An sonst wird Rd auf 0 gesetzt.
        |Für echt größer einfach die Argumente umdrehen.
    """.trimMargin(),
    usage = listOf("Größer (>) Tests", "Vergleiche", "Verzweigungen", "Schleifen", "Coole Dinge wenn man Rd als Zahl statt als Logik-Wert betrachtet"),
    seeAlso = listOf(Reference.immediateVersion("SLTI"))
)

object SLTI: Instruction(
    name = "SLTI",
    longname = "Set if Less Than Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Arithmetic.Comparison),
    compactDescription = "Rd = if (Rs1 < Imm) then (1) else (0)",
    description = """Setzt Rd auf 1, wenn Rs1 echt kleiner Imm ist. An sonst wird Rd auf 0 gesetzt.
        |Für größer testen, ob Rs1 nicht echt kleiner / gleich Imm ist.
    """.trimMargin(),
    usage = listOf("Größer / gleich (>=) Immediate Tests (negiert)", "Vergleiche", "Verzweigungen", "Schleifen", "Coole Dinge wenn man Rd als Zahl statt als Logik-Wert betrachtet"),
    seeAlso = listOf(Reference.registerVersion("SLT"))
)