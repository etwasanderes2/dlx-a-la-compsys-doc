package dlx.concrete.comparison

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object SLE: Instruction(
    name = "SLE",
    longname = "Set if Less or Equal",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Arithmetic.Comparison),
    compactDescription = "Rd = if (Rs1 <= Rs2) then (1) else (0)",
    description = """Setzt Rd auf 1, wenn Rs1 kleiner oder gleich Rs2 ist. An sonst wird Rd auf 0 gesetzt.
        |Für größer / gleich einfach die Argumente umdrehen.
    """.trimMargin(),
    usage = listOf("Größer oder gleich (>=) Tests", "Vergleiche", "Verzweigungen", "Schleifen", "Coole Dinge wenn man Rd als Zahl statt als Logik-Wert betrachtet"),
    seeAlso = listOf(Reference.immediateVersion("SLEI"))
)

object SLEI: Instruction(
    name = "SLEI",
    longname = "Set if Less or Equal to Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Arithmetic.Comparison),
    compactDescription = "Rd = if (Rs1 <= Imm) then (1) else (0)",
    description = """Setzt Rd auf 1, wenn Rs1 kleiner oder gleich Imm ist. An sonst wird Rd auf 0 gesetzt.
        |Für größer / gleich testen, ob Rs1 nicht echt kleiner Imm ist.
    """.trimMargin(),
    usage = listOf("Größer (>) Immediate Tests (negiert)", "Vergleiche", "Verzweigungen", "Schleifen", "Coole Dinge wenn man Rd als Zahl statt als Logik-Wert betrachtet"),
    seeAlso = listOf(Reference.registerVersion("SLE"))
)