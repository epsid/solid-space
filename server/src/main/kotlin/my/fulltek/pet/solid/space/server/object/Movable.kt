package my.fulltek.pet.solid.space.server.`object`

import my.fulltek.pet.solid.space.server.data.Vector

interface Movable {
    fun getPosition(): Vector
    fun getVelocity(): Vector
    fun setPosition(newValue: Vector)
}