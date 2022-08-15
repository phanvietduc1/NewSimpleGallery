package com.example.simplegallery2.retrofit

import android.util.Base64
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://dev-api.mymy.io/"

    private val okHttpClient = OkHttpClient.Builder()
            .addInterceptor { chain ->
                val original = chain.request()

                val requestBuilder = original.newBuilder()
                        .addHeader("access_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.UbXKE2v39dtj-7aRRNGfFQFC9sZQMav_Mw4Hjh694U4")

                val request = requestBuilder.build()
                chain.proceed(request)
            }.build()

    val instance: ApiService by lazy{
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()

        retrofit.create(ApiService::class.java)
    }

}