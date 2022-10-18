package my.fulltek.pet.solid.space.server.`object`

import my.fulltek.pet.solid.space.server.data.Vector

interface SpeedChangeable: Movable {
    fun setVelocity(newValue: Vector)
}