package dev.keikem.catzappWithCounter.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.keikem.catzappWithCounter.data.local.dao.CatDao
import dev.keikem.catzappWithCounter.data.local.dao.CounterDao
import dev.keikem.catzappWithCounter.data.local.dao.DogDao
import dev.keikem.catzappWithCounter.data.local.entity.LocalCat
import dev.keikem.catzappWithCounter.data.local.entity.LocalCounter
import dev.keikem.catzappWithCounter.data.local.entity.LocalDog


//Обьект базы данных
@Database(
    entities = [
        LocalCat::class,
        LocalDog::class,
        LocalCounter::class,
    ],
    //После добавления новой сущности - увеличиваем версию
    version = 1,
    autoMigrations = [
        //После добавления новой сущности - увеличиваем версию и добавляем авто миграции по образцу ниже
        // AutoMigration(1, 2)
    ],
    exportSchema = true
)
abstract class Database : RoomDatabase() {
    abstract fun catDao(): CatDao

    abstract fun dogDao(): DogDao
    abstract fun counterDao(): CounterDao
}


