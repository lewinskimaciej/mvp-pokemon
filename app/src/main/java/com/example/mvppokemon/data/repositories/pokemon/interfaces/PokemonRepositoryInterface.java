package com.example.mvppokemon.data.repositories.pokemon.interfaces;

import com.example.mvppokemon.data.models.PokemonModel;

import io.reactivex.Observable;


public interface PokemonRepositoryInterface extends PokemonDataSource {
    Observable<PokemonModel> getPokemon(int number);

    void savePokemon(PokemonModel pokemonModel);
}