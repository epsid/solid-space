package my.fulltek.pet.solid.space.server

import my.fulltek.pet.solid.space.server.data.Vector

interface Rotatable {
    fun getAngle(): Vector
    fun setAngle(newValue: Vector)
}