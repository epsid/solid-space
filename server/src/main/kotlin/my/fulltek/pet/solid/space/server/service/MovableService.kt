package my.fulltek.pet.solid.space.server.service

import my.fulltek.pet.solid.space.server.`object`.UObject

interface MovableService {
    fun findById(id: Long): UObject
}