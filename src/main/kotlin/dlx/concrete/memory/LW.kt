package dlx.concrete.memory

import dlx.generic.DLXArgtype
import dlx.generic.DLXFormat
import dlx.generic.DLXTag
import dlx.generic.Instruction
import dlx.generic.Reference
import dlx.generic.SimpleLink

object LW: Instruction(
    name = "LW",
    longname = "Load Word",
    format = DLXFormat.IMMEDIATE,
    tags = setOf(DLXTag.Format.Immediate, DLXTag.Category.Memory),
    compactDescription = "Rd = Mem[Imm + Rs1]",
    description = """Lade den Wert, der an der berechneten Adresse im Speicher steht in Rd.
        |Die Adresse wir berechnet, in dem ein Immediate Wert mit dem Wert eines Registers addiert wird.
    """.trimMargin(),
    usage = listOf("Laden von Werten", "Array Zugriff", "Stack Pop"),
    seeAlso = listOf(Reference("Zum Schreiben des Speichers", SimpleLink("SW"))),
    argtypes = listOf(DLXArgtype.REGISTER, DLXArgtype.MEM_ADDRESS)
)