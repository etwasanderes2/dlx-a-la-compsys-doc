package dlx.generic

import kotlinx.html.FlowOrInteractiveOrPhrasingContent
import kotlinx.html.a

class Reference(val descriptor: String, val target: Linkable): Linkable by target {
    companion object {
        fun immediateVersion(target: String) = Reference("Immediate Version", SimpleLink(target))
        fun registerVersion(target: String) = Reference("Register Version", SimpleLink(target))
        fun negatedVersion(target: String) = Reference("Negierte Version", SimpleLink(target))
        fun arithmeticVersion(target: String) = Reference("Arithmetische Version", SimpleLink(target))
        fun logicalVersion(target: String) = Reference("Logische Version", SimpleLink(target))
    }
}