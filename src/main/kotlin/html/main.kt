package html

import dlx.concrete.arithmetic.*
import dlx.concrete.comparison.*
import dlx.concrete.flow.branch.*
import dlx.concrete.flow.jump.*
import dlx.concrete.logic.bitwise.*
import dlx.concrete.logic.shift.*
import dlx.concrete.memory.*
import kotlinx.html.body
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.link
import kotlinx.html.meta
import kotlinx.html.stream.appendHTML
import kotlinx.html.title

import java.io.File

val ALL_INSTRUCTIONS = listOf(
    ADD,
    ADDI,
    SUB,
    SUBI,
    MULT,

    SEQ,
    SEQI,
    SNE,
    SNEI,
    SLE,
    SLEI,
    SLT,
    SLTI,

    AND,
    ANDI,
    OR,
    ORI,
    XOR,
    XORI,

    SLL,
    SLLI,
    SRL,
    SRLI,
    SRA,
    SRAI,

    BEQZ,
    BNEZ,
    J,
    JR,
    JAL,
    JALR,

    LW,
    SW,
)

fun main() {
    File("website/pages/instructions").mkdirs()

    for (ins in ALL_INSTRUCTIONS) {
        val writer = File("website/pages/instructions/${ins.name}.html").writer()
        writer.append("<!DOCTYPE html>\n")
        writer.appendHTML().html {
            head {
                title { +"$ins - DLX Reference" }
                meta(charset = "UTF-8")
                link(href = "../../stylesheets/general.css", rel = "stylesheet")
                link(href = "../../stylesheets/instruction.css", rel = "stylesheet")
            }

            body {
                ins.appendHtml(this)
            }
        }
        writer.close()
        println("Written html for $ins")
    }

    val writer = File("website/pages/index.html").writer()
    writer.append("<!DOCTYPE html>\n")
    writer.appendHTML().html {
        head {
            title { +"DLX Reference" }
            meta(charset = "UTF-8")
            link(href = "../stylesheets/general.css", rel = "stylesheet")
            link(href = "../stylesheets/index.css", rel = "stylesheet")
        }

        body {
            appendIndex(ALL_INSTRUCTIONS)
        }
    }
    writer.close()
    println("Written html for index")
}