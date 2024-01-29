package dev.keikem.catzappWithCounter.domain.usecases

import dev.keikem.catzappWithCounter.data.local.entity.LocalCat
import dev.keikem.catzappWithCounter.data.repository.CatRepository

//Класс, репрезентующии получение данных с бека и преобразование в то с чем мы работаем, а также сохранение в базу
class GimmeACatRemoteUseCase {

    private val catRepository: CatRepository = CatRepository()

    fun gimme(): String {
        val catUrl = catRepository.loadFromRemote()
        catRepository.saveToLocal(LocalCat(id = "1", imageUrl = catUrl))
        return catUrl
    }
}