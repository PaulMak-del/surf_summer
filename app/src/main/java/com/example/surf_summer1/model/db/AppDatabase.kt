package com.example.surf_summer1.model.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [CocktailEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun cocktailDao() : CocktailDao
}