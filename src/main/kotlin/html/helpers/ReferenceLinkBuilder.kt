package html.helpers

import dlx.generic.Linkable
import kotlinx.html.FlowOrInteractiveOrPhrasingContent
import kotlinx.html.a

fun FlowOrInteractiveOrPhrasingContent.insertLink(
    ref: Linkable,
    prefix: String = "",
    postfix: String = ".html")
{
    a(href = prefix + ref.getLinkAddress() + postfix) { +ref.getLinkName() }
}