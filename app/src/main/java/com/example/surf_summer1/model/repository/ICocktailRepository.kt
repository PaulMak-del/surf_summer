package com.example.surf_summer1.model.repository

import com.example.surf_summer1.model.db.CocktailEntity
import kotlinx.coroutines.flow.Flow


interface ICocktailRepository {

    fun getCocktails() : Flow<List<CocktailEntity>>

    fun getCocktails(id: Long) : Flow<CocktailEntity>

    fun insertCocktail(cocktailEntity: CocktailEntity)

    fun deleteCocktail(cocktailEntity: CocktailEntity)
}