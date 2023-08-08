package com.example.surf_summer1.domain.usecases

import com.example.surf_summer1.model.db.CocktailEntity
import com.example.surf_summer1.model.repository.CocktailRepository
import javax.inject.Inject

class InsertCocktailUseCase @Inject constructor(
    private val cocktailRepository: CocktailRepository
) {

    fun execute(cocktail: CocktailEntity) {
        cocktailRepository.insertCocktail(cocktail)
    }
}