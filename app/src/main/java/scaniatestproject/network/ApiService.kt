package com.example.scaniatestproject.network

import com.example.scaniatestproject.data.Dog
import com.example.scaniatestproject.data.ImageData
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("api/breeds/list/all")
    fun getMostPopularMovies() : Call<Dog?>

    @GET("api/breed/hound/{id}/images")
    fun getImageList(@Path("id") id : String?) : Call<ImageData?>
}

object DogsApi {
    private const val BASE_URL = "https://dog.ceo/"
    val logIntercept = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(logIntercept)
        .build()
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    val apiService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}