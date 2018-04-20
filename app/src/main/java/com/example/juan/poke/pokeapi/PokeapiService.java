package com.example.juan.poke.pokeapi;

import com.example.juan.poke.modelos.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(int i, int offset);
}
