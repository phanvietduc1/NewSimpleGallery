package com.example.simplegallery2.models

import com.google.gson.annotations.SerializedName

data class ImageDataResponse(
    @SerializedName("data")
    var data : ArrayList<DataImage>? = null,
    @SerializedName("pages")
    var pages: Page? = null,
    @SerializedName("items")
    var items: Item? = null,
    @SerializedName("message")
    var message: String? = null,
    @SerializedName("result")
    var result: String? = null
)
