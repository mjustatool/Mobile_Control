package com.example.pokemonapi.network;

import com.example.pokemonapi.model.pokemoninfo.PokemonInfoAPI;
import com.example.pokemonapi.model.pokemonlist.PokemonListAPI;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {
    //here we precise size of pokemon
    @GET("pokemon?limit=20")
    Observable<PokemonListAPI> fetchPokemonList(@Query("offset") int offset);
    //getting pokemon data by name
    @GET("pokemon/{name}")
    Observable<PokemonInfoAPI> fetchPokemonInfo(@Path("name") String name);
}
