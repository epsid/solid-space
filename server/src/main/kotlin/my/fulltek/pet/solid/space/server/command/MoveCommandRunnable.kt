package my.fulltek.pet.solid.space.server.command

import my.fulltek.pet.solid.space.server.`object`.UObject
import java.util.Queue

interface MoveCommandRunnable<E : Command> {
    fun getMovingObject(): UObject
    fun getSpeed(): Int
    fun getQueue(): Queue<E>
}