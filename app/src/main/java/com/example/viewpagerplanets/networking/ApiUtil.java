package com.example.viewpagerplanets.networking;

public class ApiUtil {

    private static final String BASE_URL = "https://raw.githubusercontent.com/";

    public static Planet_Service getApiService(){

        return RetrofitClient.getRetrofit(BASE_URL).create(Planet_Service.class);
    }
}
