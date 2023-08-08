package com.example.surf_summer1.domain.usecases

import com.example.surf_summer1.model.db.CocktailEntity
import com.example.surf_summer1.model.repository.CocktailRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCocktailsListUseCase @Inject constructor(
    private val cocktailRepository: CocktailRepository
) {

    fun execute() : Flow<List<CocktailEntity>> {
        return cocktailRepository.getCocktails()
    }
}