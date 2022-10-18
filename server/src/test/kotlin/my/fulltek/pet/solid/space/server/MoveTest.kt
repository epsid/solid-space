package my.fulltek.pet.solid.space.server

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import my.fulltek.pet.solid.space.server.command.impl.MoveCommand
import my.fulltek.pet.solid.space.server.data.Vector
import my.fulltek.pet.solid.space.server.`object`.Movable
import org.junit.jupiter.api.Test

internal class MoveTest {

    @Test
    fun movingObjectTest() {
        val position = Vector(12, 5)
        val velocity = Vector(-7, 3)
        val movable = mockk<Movable>()
        every { movable.getPosition() } returns position
        every { movable.getVelocity() } returns velocity
        val move = MoveCommand(movable)
        move.execute()
        verify { movable.getPosition().x == 5 && movable.getPosition().y == 7 }
    }
}