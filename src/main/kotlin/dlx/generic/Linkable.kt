package dlx.generic

interface Linkable {
    fun getLinkAddress(): String
    fun getLinkName(): String
}

class SimpleLink(val address: String, val name: String = address): Linkable {
    override fun getLinkAddress() = address
    override fun getLinkName() = name
}