package dlx.concrete.flow.jump

import dlx.generic.DLXArgtype
import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object J: Instruction(
    name = "J",
    longname = "Jump",
    format = DLXFormat.JUMP,
    tags = setOf(DLXTag.Format.Jump, DLXTag.Category.Flow.Jump),
    compactDescription = "PC = NPC + Imm",
    description = """Springe zu dem angegeben Label.
        |
        |Die Labels werden beim Kompilieren durch tatsächliche Zahlenwerte ersetzt.
    """.trimMargin(),
    warning = """Der Sprung passiert relativ zur Adresse des nächsten Befehls.
        |Da Imm eine signed 26 bit Zahl ist (Sonderfall bei Jump, sonst 16 bit) und ein Befehl 32 bit Speicher verwendet, kann somit maximal 8388607 Befehle vor- bzw. 8388608 Befehle zurück gesprungen werden (Relativ zum nächsten Befehl).
        |Unser DLX Emulator mag es nicht, wenn man die Immediate Werte direkt angibt, also einfach Label angeben""".trimMargin(),
    usage = listOf("Schleifen"),
    seeAlso = listOf(Reference.registerVersion("JR")),
    argtypes = listOf(DLXArgtype.JUMP_LABEL)
)

object JR: Instruction(
    name = "JR",
    longname = "Jump Register",
    format = DLXFormat.IMMEDIATE,   // Yes, really.
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Flow.Jump),
    compactDescription = "PC = Rs1",
    description = """Springe zu der in Rs1 angegeben Adresse.""",
    warning = """User DLX Emulator verwendet Zeilennummer anstatt Adressen.""",
    usage = listOf("Schleifen", "Rücksprung von Unterprogrammen", "Wenn die 26 bit von J nicht genug sind"),
    seeAlso = listOf(Reference.immediateVersion("J")),
    argtypes = listOf(DLXArgtype.REGISTER)
)