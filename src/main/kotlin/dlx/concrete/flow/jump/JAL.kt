package dlx.concrete.flow.jump

import dlx.generic.DLXArgtype
import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference

object JAL: Instruction(
    name = "JAL",
    longname = "Jump And Link",
    format = DLXFormat.JUMP,
    tags = setOf(DLXTag.Format.Jump, DLXTag.Category.Flow.Jump),
    compactDescription = "PC = NPC + Imm; R31 = NPC",
    description = """Springe zu dem angegeben Label.
        |Speichere die Adresse des nächsten Befehls in R31.
        |
        |Die Labels werden beim Kompilieren durch tatsächliche Zahlenwerte ersetzt.
    """.trimMargin(),
    warning = """Der Sprung passiert relativ zur Adresse des nächsten Befehls.
        |Da Imm eine signed 26 bit Zahl ist (Sonderfall bei Jump, sonst 16 bit) und ein Befehl 32 bit Speicher verwendet, kann somit maximal 8388607 Befehle vor- bzw. 8388608 Befehle zurück gesprungen werden (Relativ zum nächsten Befehl).
        |Unser DLX Emulator mag es nicht, wenn man die Immediate Werte direkt angibt, also einfach Label angeben""".trimMargin(),
    usage = listOf("Aufruf von Unterprogrammen"),
    seeAlso = listOf(Reference.registerVersion("JALR")),
    argtypes = listOf(DLXArgtype.JUMP_LABEL)
)

object JALR: Instruction(
    name = "JALR",
    longname = "Jump And Link Register",
    format = DLXFormat.IMMEDIATE,   // Yes, really.
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Flow.Jump),
    compactDescription = "PC = Rs1; R31 = NPC",
    description = """Springe zu der in Rs1 angegeben Adresse.
        |Speichere die Adresse des nächsten Befehls in R31.
    """.trimMargin(),
    warning = """User DLX Emulator verwendet Zeilennummer anstatt Adressen.""",
    usage = listOf("Aufruf von Unterprogrammen, deren Adressen man in Registern hat (bei uns selten)", "Wenn die 26 bit von JAL nicht genug sind"),
    seeAlso = listOf(Reference.immediateVersion("JAL")),
    argtypes = listOf(DLXArgtype.REGISTER)
)