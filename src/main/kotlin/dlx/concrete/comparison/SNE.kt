package dlx.concrete.comparison

import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object SNE: Instruction(
    name = "SNE",
    longname = "Set if Not Equal",
    format = DLXFormat.REGISTER,
    tags = setOf(DLXTag.Format.Register, DLXTag.Category.Arithmetic.Comparison),
    compactDescription = "Rd = if (Rs1 != Rs2) then (1) else (0)",
    description = """Setzt Rd auf 1, wenn Rs1 ungleich Rs2 ist. An sonst wird Rd auf 0 gesetzt.""",
    usage = listOf("Vergleiche", "Verzweigungen", "Schleifen", "Coole Dinge wenn man Rd als Zahl statt als Logik-Wert betrachtet"),
    seeAlso = listOf(Reference.immediateVersion("SEQI"), Reference.negatedVersion("SEQ"))
)

object SNEI: Instruction(
    name = "SNEI",
    longname = "Set if Not Equal to Immediate",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Arithmetic.Comparison),
    compactDescription = "Rd = if (Rs1 != Imm) then (1) else (0)",
    description = """Setzt Rd auf 1, wenn Rs1 ungleich Imm ist. An sonst wird Rd auf 0 gesetzt.""",
    usage = listOf("Vergleiche", "Verzweigungen", "Schleifen", "Coole Dinge wenn man Rd als Zahl statt als Logik-Wert betrachtet"),
    seeAlso = listOf(Reference.registerVersion("SEQ"), Reference.negatedVersion("SEQI"))
)