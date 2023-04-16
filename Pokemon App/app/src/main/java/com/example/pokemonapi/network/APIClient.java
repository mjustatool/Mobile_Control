package com.example.pokemonapi.network;

import com.example.pokemonapi.model.pokemoninfo.PokemonInfoAPI;
import com.example.pokemonapi.model.pokemonlist.PokemonListAPI;

import io.reactivex.rxjava3.core.Observable;

public class APIClient {

    private final APIService apiService;

    public APIClient(APIService apiService) {
        this.apiService = apiService;
    }
    //returning a pokemon list we recieved ( list of pokemon )
    public Observable<PokemonListAPI> observableFetchPokemonList(int offset) {
        return apiService.fetchPokemonList(offset);
    }
    //here we return just pokemon infos
    public Observable<PokemonInfoAPI> observableFetchPokemonInfo(String name) {
        return apiService.fetchPokemonInfo(name);
    }
}
