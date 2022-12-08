package com.example.royalcookie

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET("/obtenergalletas")
    fun obtenerEntregas(): Call<List<DatosGS>>
}