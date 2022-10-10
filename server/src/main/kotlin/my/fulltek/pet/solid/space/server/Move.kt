package my.fulltek.pet.solid.space.server

import my.fulltek.pet.solid.space.server.data.Vector

class Move(private val movable: Movable) {
    fun execute() {
        movable.setPosition(
            Vector.plus(movable.getPosition(), movable.getVelocity())
        )
    }
}