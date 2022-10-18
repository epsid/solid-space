package my.fulltek.pet.solid.space.server.`object`

import my.fulltek.pet.solid.space.server.data.Vector

interface Rotatable {
    fun getAngle(): Vector
    fun setAngle(newValue: Vector)
}