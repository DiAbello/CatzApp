package dev.keikem.catzappWithCounter.domain.usecases

import dev.keikem.catzappWithCounter.data.repository.DogRepository

class GimmeADogLocalUseCase {

    private val repository: DogRepository = DogRepository()

    fun gimme(): String? = repository.loadFromLocal()
}