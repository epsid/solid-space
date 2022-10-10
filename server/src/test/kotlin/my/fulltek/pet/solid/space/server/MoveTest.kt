package my.fulltek.pet.solid.space.server

import my.fulltek.pet.solid.space.server.data.MovableImpl
import my.fulltek.pet.solid.space.server.data.Vector
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class MoveTest {
    @Test
    fun movingObjectTest() {
        val position = Vector(12, 5)
        val velocity = Vector(-7, 3)
        val movableImpl = MovableImpl(position, velocity)
        Move(movableImpl).execute()
        assertTrue { movableImpl.getPosition().x == 5 && movableImpl.getPosition().y == 8 }
    }

}