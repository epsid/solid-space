package my.fulltek.pet.solid.space.server.data

import my.fulltek.pet.solid.space.server.Rotatable

data class RotatableImpl(private var angle: Vector) : Rotatable {

    override fun getAngle(): Vector {
        return angle
    }

    override fun setAngle(newValue: Vector) {
        angle = newValue
    }
}