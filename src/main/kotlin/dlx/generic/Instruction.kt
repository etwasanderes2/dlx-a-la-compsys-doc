package dlx.generic

import dlx.concrete.arithmetic.*

typealias Text = String
typealias Code = String

open class Instruction(
            val name: String,
            val longname: String,
            val format: DLXFormat,
            val tags: Set<DLXTag>,
            val compactDescription: String,
            val description: Text,
            val warning: Text? = null,
            val usage: List<String> = listOf(),
            val seeAlso: List<Reference> = listOf(),
            val argtypes: List<DLXArgtype> = format.defaultArgTypes,
            val examples: List<Example> = listOf(),
) : Linkable {

    val tagStings: Set<String> = tags.flatMap { it.names }.toSet()

    override fun getLinkAddress() = name
    override fun getLinkName() = name

    override fun toString() = name
}

