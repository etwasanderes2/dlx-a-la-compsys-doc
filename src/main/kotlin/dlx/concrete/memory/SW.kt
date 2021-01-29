package dlx.concrete.memory

import dlx.generic.DLXArgtype
import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference
import dlx.generic.SimpleLink

object SW: Instruction(
    name = "SW",
    longname = "Store Word",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Memory),
    compactDescription = "Mem[Imm + Rs1] = Rs2",
    description = """Berechne eine Adresse im Speicher und speichere dort Rs2.
        |Die Adresse wir berechnet, in dem ein Immediate Wert mit dem Wert eines Registers addiert wird.
    """.trimMargin(),
    warning = """Etwas inkonsistente Namensgebung:
        |Befehle im Immediate Format verwenden typischerweise zwei Register, die mit Rd und Rs1 bezeichnet werden.
        |Allerdings ist Rd typischerweise die Bezeichnung für das Register, in das ein Wert geschrieben wird.
        |Deswegen haben wir hier die Register mit Rs1 und Rs2 bezeichnet.
    """.trimMargin(),
    usage = listOf("Speichern von Werten", "Array Zugriff", "Stack Push"),
    seeAlso = listOf(Reference("Zum Lese des Speichers", SimpleLink("LW"))),
    argtypes = listOf(DLXArgtype.MEM_ADDRESS, DLXArgtype.REGISTER)
)