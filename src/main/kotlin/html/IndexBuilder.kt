package html

import dlx.generic.Instruction
import html.helpers.insertLink
import kotlinx.html.FlowContent
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.li
import kotlinx.html.ol
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun FlowContent.appendIndex(instructions: Collection<Instruction>) {
    div(classes = "main") {
        div {
            h1 { +"Übersicht" }
        }

        div {
            table {
                for (ins in instructions.sortedBy { it.name }) {
                    tr {
                        td { insertLink(ins, prefix = "instructions/") }
                    }
                }
            }
        }
    }
}