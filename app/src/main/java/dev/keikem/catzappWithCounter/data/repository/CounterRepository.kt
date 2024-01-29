package dev.keikem.catzappWithCounter.data.repository

import dev.keikem.catzappWithCounter.DatabaseHolder
import dev.keikem.catzappWithCounter.data.local.entity.LocalCounter

class CounterRepository {

    private val database = DatabaseHolder.provideDb()
    fun loadFromLocal(): String? = database?.counterDao()?.get()?.countedNumber

    fun saveToLocal(counter: LocalCounter) {
        database?.counterDao()?.set(counter)
    }
}