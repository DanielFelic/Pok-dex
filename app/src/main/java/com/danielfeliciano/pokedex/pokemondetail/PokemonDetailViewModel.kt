package com.danielfeliciano.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.danielfeliciano.pokedex.data.remote.responses.Pokemon
import com.danielfeliciano.pokedex.repository.PokemonRepository
import com.danielfeliciano.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}