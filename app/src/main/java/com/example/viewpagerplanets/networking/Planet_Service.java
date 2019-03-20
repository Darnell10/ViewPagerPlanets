package com.example.viewpagerplanets.networking;

import com.example.viewpagerplanets.model.Planets;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Planet_Service {

    @GET("JDVila/storybook/master/planets.json")
    Call<Planets> getPlanets();
}
