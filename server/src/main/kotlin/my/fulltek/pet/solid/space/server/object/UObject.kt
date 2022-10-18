package my.fulltek.pet.solid.space.server.`object`

interface UObject {
    fun setProperty(key: String, newValue: Any?)
    fun getProperty(key: String): Any
}