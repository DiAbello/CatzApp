package dev.keikem.catzappWithCounter.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.keikem.catzappWithCounter.data.local.entity.LocalCounter


//Сущность для взаимодействия с таблицей БД котиков
@Dao
interface CounterDao {

    @Query("SELECT * from counter_table")
    fun get() : LocalCounter?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun set(cat: LocalCounter)
}