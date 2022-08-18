package com.example.myapplication.retrofitobjects

import com.example.myapplication.model.ChuckJoke
import retrofit2.Response
import retrofit2.http.GET

interface JokeAPI {
    @GET("/random")
    suspend fun getJoke(): Response<ChuckJoke>
}