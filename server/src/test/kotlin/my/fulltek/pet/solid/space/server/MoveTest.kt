package my.fulltek.pet.solid.space.server

import my.fulltek.pet.solid.space.server.command.impl.MoveCommand
import my.fulltek.pet.solid.space.server.data.MovableImpl
import my.fulltek.pet.solid.space.server.data.Vector
import org.junit.jupiter.api.Test

internal class MoveTest {
//todo rewrite with Mockk, how to mock setPosition?
    @Test
    fun movingObjectTest() {
        val position = Vector(12, 5)
        val velocity = Vector(-7, 3)
        val movable = MovableImpl(position, velocity)
        val move = MoveCommand(movable)
        move.execute()
        assert(movable.getPosition().x == 5 && movable.getPosition().y == 8)
    }
}