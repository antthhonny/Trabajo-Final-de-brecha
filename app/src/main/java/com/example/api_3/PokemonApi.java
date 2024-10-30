package com.example.api_3;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonApi {
    @GET("pokemon/{name}")
    Call<api_b> getPokemon(@Path("name") String name);
}
