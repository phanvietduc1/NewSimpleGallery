package com.example.simplegallery2.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Page(
    @SerializedName("current")
    @Expose
    var current: Int? = null,
    @SerializedName("prev")
    @Expose
    var prev: Int? = null,
    @SerializedName("hasPrev")
    @Expose
    var hasPrev: Boolean? = null,
    @SerializedName("next")
    @Expose
    var next: Int? = null,
    @SerializedName("hasNext")
    @Expose
    var hasNext: Boolean? = null,
    @SerializedName("total")
    @Expose
    var total: Int? = null
)
