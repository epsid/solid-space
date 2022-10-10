package my.fulltek.pet.solid.space.server.data

import my.fulltek.pet.solid.space.server.Movable

data class MovableImpl(private var position: Vector, private val velocity: Vector) : Movable {
    override fun getPosition(): Vector {
        return position
    }

    override fun getVelocity(): Vector {
        return velocity
    }

    override fun setPosition(newValue: Vector) {
        position = newValue
    }
}
