package my.fulltek.pet.solid.space.server.command

import java.util.Queue

interface MoveCommandEndable<E : Command> {
    fun getMovableCommand(): E
    fun getQueue(): Queue<E>
}