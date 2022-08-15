package com.example.simplegallery2.retrofit

import com.example.simplegallery2.models.ImageDataResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface ApiService {
    @GET("v1/auth/assets")
    fun getImages(@Header("access_token") access_token: String): Call<ImageDataResponse>

//    @GET("auth/assets/{id}/data")
//    fun getOriginImage(@Header("access_token") access_token: String, @Path("id") id: String): Call<ImageOriginResponse>
}
