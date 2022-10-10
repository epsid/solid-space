package my.fulltek.pet.solid.space.server.data

data class Vector(var x: Int, val y: Int) {

    companion object {
        fun plus(first: Vector, second: Vector): Vector {
            return Vector(first.x + second.x, first.y + second.y)
        }
    }
}
