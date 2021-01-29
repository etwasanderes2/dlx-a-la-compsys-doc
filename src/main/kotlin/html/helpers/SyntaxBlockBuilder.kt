package html.helpers

import dlx.generic.Instruction
import kotlinx.html.FlowContent
import kotlinx.html.p
import kotlinx.html.span

fun FlowContent.insertSyntaxBlock(ins: Instruction) {
    p(classes = "codeblock syntaxbox") {
        span(classes = "ch_instruction") { +ins.name }
        for (arg in ins.argtypes) {
            +" "
            span(classes = "${arg.cssClass} ch_arg") { +arg.symbol }
        }
    }
}