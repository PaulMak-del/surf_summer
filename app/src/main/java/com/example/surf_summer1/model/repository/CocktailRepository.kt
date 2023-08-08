package com.example.surf_summer1.model.repository

import com.example.surf_summer1.model.db.CocktailDao
import com.example.surf_summer1.model.db.CocktailEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CocktailRepository @Inject constructor(
    private val cocktailDao: CocktailDao,
) : ICocktailRepository {
    override fun getCocktails(): Flow<List<CocktailEntity>> =
        cocktailDao.getCocktails()

    override fun getCocktails(id: Long): Flow<CocktailEntity> =
        cocktailDao.getCocktail(id)

    override fun insertCocktail(cocktailEntity: CocktailEntity) {
        cocktailDao.insertCocktail(cocktailEntity)
    }

    override fun deleteCocktail(cocktailEntity: CocktailEntity) {
        cocktailDao.deleteCocktail(cocktailEntity)
    }
}