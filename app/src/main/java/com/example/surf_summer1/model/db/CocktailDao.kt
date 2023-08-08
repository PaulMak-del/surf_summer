package com.example.surf_summer1.model.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CocktailDao {

    @Query("select * from cocktail")
    fun getCocktails() : Flow<List<CocktailEntity>>

    @Query("select * from cocktail where id = :id")
    fun getCocktail(id: Long) : Flow<CocktailEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCocktail(cocktail: CocktailEntity)

    @Delete
    fun deleteCocktail(cocktail: CocktailEntity)
}