package dev.keikem.catzappWithCounter.domain.usecases

import dev.keikem.catzappWithCounter.data.repository.CatRepository

//Класс, репрезентующии получение данных с базы и преобразование в то с чем мы работаем
class GimmeACatLocalUseCase {

    private val catRepository: CatRepository = CatRepository()

    fun gimme(): String? = catRepository.loadFromLocal()
}