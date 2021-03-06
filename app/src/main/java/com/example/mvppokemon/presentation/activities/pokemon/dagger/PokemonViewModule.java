package com.example.mvppokemon.presentation.activities.pokemon.dagger;

import android.support.annotation.NonNull;

import com.example.mvppokemon.dagger.qualifier.Repository;
import com.example.mvppokemon.data.repositories.pokemon.interfaces.PokemonRepositoryInterface;
import com.example.mvppokemon.presentation.activities.pokemon.PokemonPresenter;
import com.example.mvppokemon.presentation.base.PresenterFactory;

import dagger.Module;
import dagger.Provides;

@Module
public final class PokemonViewModule {

    @Provides
    public PresenterFactory<PokemonPresenter> providePresenterFactory(@NonNull @Repository PokemonRepositoryInterface pokemonRepository) {
        return () -> new PokemonPresenter(pokemonRepository);
    }
}
