package my.fulltek.pet.solid.space.server

import my.fulltek.pet.solid.space.server.command.impl.RotateCommand
import my.fulltek.pet.solid.space.server.data.RotatableImpl
import my.fulltek.pet.solid.space.server.data.Vector
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RotateTest {
    //todo mockk?
    @Test
    fun rotatingObjectTest() {
        val angle = Vector(12, 6)
        val rotatableImpl = RotatableImpl(angle)
        RotateCommand(rotatableImpl).execute()
        assertTrue { rotatableImpl.getAngle().x == 12 && rotatableImpl.getAngle().y == 6 }
    }
}
