package com.example.surf_summer1.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.surf_summer1.domain.usecases.GetCocktailsListUseCase
import com.example.surf_summer1.model.db.CocktailEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CocktailListViewModel @Inject constructor(
    private val getCocktailsListUseCase: GetCocktailsListUseCase
) : ViewModel() {

    private val _cocktails = MutableLiveData<List<CocktailEntity>>()
    val cocktails : LiveData<List<CocktailEntity>> = _cocktails

    fun loadCocktails() {
        viewModelScope.launch {
            getCocktailsListUseCase.execute()
                .collect {
                    _cocktails.value = it
                }
        }
    }
}


