package dev.keikem.catzappWithCounter.domain.usecases

import dev.keikem.catzappWithCounter.data.local.entity.LocalCounter
import dev.keikem.catzappWithCounter.data.repository.CounterRepository

//Класс, репрезентующии получение данных с базы и преобразование в то с чем мы работаем
class GimmeACounterLocalUseCase {

    private val counterRepository: CounterRepository = CounterRepository()

    fun gimme(): String {
        var countNum = counterRepository.loadFromLocal()?.toIntOrNull()
        return if(countNum == null) {
            counterRepository.saveToLocal(LocalCounter(id = "1", countedNumber = "0"))
            countNum = 0;
            countNum.toString()
        } else {
            countNum.toString()
        }
    }
}