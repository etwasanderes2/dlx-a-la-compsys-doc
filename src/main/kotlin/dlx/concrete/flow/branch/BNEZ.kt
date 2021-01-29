package dlx.concrete.flow.branch

import dlx.generic.DLXArgtype
import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object BNEZ: Instruction(
    name = "BNEZ",
    longname = "Branch if Not Equal to Zero",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Flow.Branch),
    compactDescription = "PC = if (Rs1 != 0) then (NPC + Imm) else (NPC)",
    description = """Wenn Rs1 ungleich 0 ist, springe zu den angegeben Label.
        |An sonst führe die nächste Instruktion aus.
        |
        |Die Labels werden beim Kompilieren durch tatsächliche Zahlenwerte ersetzt.
    """.trimMargin(),
    warning = """Der Sprung passiert relativ zur Adresse des nächsten Befehls.
        |Da Imm eine signed 16 bit Zahl ist und ein Befehl 32 bit Speicher verwendet, kann somit maximal  8191 Befehle vor- bzw.  8192 Befehle zurück gesprungen werden (Relativ zum nächsten Befehl).
        |Unser DLX Emulator mag es nicht, wenn man die Immediate Werte direkt angibt, also einfach Label angeben""".trimMargin(),
    usage = listOf("Verzweigungen", "Schleifen", "Wenn BEQZ das Gegenteil von dem tut, was man will"),
    seeAlso = listOf(Reference.negatedVersion("BEQZ")),
    argtypes = listOf(DLXArgtype.REGISTER, DLXArgtype.JUMP_LABEL)
)