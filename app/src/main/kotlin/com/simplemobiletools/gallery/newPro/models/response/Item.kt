package com.example.simplegallery2.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("begin")
    @Expose var begin: Int? = null,
    @SerializedName("end")
    @Expose
    var end: Int? = null,
    @SerializedName("total")
    @Expose
    var total: Int? = null,
)
