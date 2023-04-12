package com.example.scaniatestproject.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.scaniatestproject.data.Dog
import com.example.scaniatestproject.data.ImageData
import com.example.scaniatestproject.network.DogsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DogViewModel : ViewModel() {

    val observableEvents = MutableLiveData<Dog?>()
    val dogImageListLiveData = MutableLiveData<ImageData?>()

    fun getListView() {
        DogsApi.retrofit
        val retrofitAPI = DogsApi.apiService
        val call: Call<Dog?> = retrofitAPI.getMostPopularMovies()

        // on below line we are making a call.
        call.enqueue(object : Callback<Dog?> {
            override fun onResponse(call: Call<Dog?>, response: Response<Dog?>) {
                if (response.isSuccessful()) {
                    observableEvents.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<Dog?>, t: Throwable) {
                // displaying an error message in toast
                Log.d("Sowmya", "Response error")
            }
        })
    }

    fun getDogsImageist(urlStr: String?) {
        DogsApi.retrofit
        val retrofitAPI = DogsApi.apiService
        Log.d("Sowmya", "urlStr:" +urlStr)
        val call: Call<ImageData?> = retrofitAPI.getImageList(urlStr)
        call.enqueue(object : Callback<ImageData?> {
            override fun onResponse(call: Call<ImageData?>, response: Response<ImageData?>) {
                if (response.isSuccessful()) {
                    dogImageListLiveData.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<ImageData?>, t: Throwable) {
                // displaying an error message in toast
                Log.d("Sowmya", "Response error")
            }
        })
    }
}