package html

import dlx.generic.Instruction
import html.helpers.insertLink
import html.helpers.insertSyntaxBlock
import kotlinx.html.*

fun Instruction.appendHtml(to: FlowContent) = with(to) {
    div(classes = "main") {

        div {
            a(href = "../not-index.html") { +"Zurück zur Übersicht" }
        }

        div(classes = "title") {
            h1 { +name }
            p { +longname }
        }

        div(classes = "taglist") {
            h2 { +"Tags" }
            ul {
                for (tag in tagStings) {
                    li {
                        p { +tag }
                    }
                }
            }
        }

        div {
            h2 { +"Syntax" }
            insertSyntaxBlock(this@appendHtml)
        }

        div {
            h2 { +"Operation" }
            p(classes = "codeblock") { +compactDescription }
        }

        div {
            h2 { +"Beschreibung" }
            div(classes = "desc") {
                p { +description }
            }
            warning?.let {
                div(classes = "warn") {
                    p { +it }
                }
            }
        }

        div {
            if (usage.isNotEmpty()) {
                h2 { +"Typische Verwendungszwecke" }
                ul {
                    for (us in usage) {
                        li { +us }
                    }
                }
            }
        }

        div {
            if (examples.isNotEmpty()) {
                h2 { +"Beispiele" }
                for ((i, ex) in examples.withIndex()) {
                    div {
                        h3 { +"Beispiel ${i + 1}" }
                        p { +ex.pretext }
                        code { +ex.code }
                        p { +ex.posttext }
                    }
                }
            }
        }

        div {
            if (seeAlso.isNotEmpty()) {
                h2 { +"Siehe auch" }
                table(classes = "seealso") { // there has to be a shorthand for this
                    for (sa in seeAlso) {
                        tr {
                            td { +sa.descriptor }
                            td { insertLink(sa) }
                        }
                    }
                }
            }
        }

    }
}