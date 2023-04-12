package com.example.scaniatestproject.data

import com.google.gson.annotations.SerializedName

data class ImageData(@SerializedName("message" ) var imageUrl : ArrayList<String> = arrayListOf(),
@SerializedName("status"  ) var status  : String?= null)
