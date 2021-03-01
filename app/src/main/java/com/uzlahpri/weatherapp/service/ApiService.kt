package com.uzlahpri.weatherapp.service

import com.uzlahpri.weatherapp.model.ResponseWeather
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET ("weather?")
    fun getWeather (
        @Query("q") name : String?,
        @Query("appid") apikey : String?
    ): Call<ResponseWeather>
}