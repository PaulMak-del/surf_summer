package com.example.surf_summer1.domain.usecases

import com.example.surf_summer1.model.db.CocktailEntity
import com.example.surf_summer1.model.repository.CocktailRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCocktailUseCase @Inject constructor(
    private val cocktailRepository: CocktailRepository
) {

    fun execute(id: Long) : Flow<CocktailEntity> {
        return cocktailRepository.getCocktails(id)
    }
}