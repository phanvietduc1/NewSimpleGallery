package com.example.simplegallery2.models

import com.google.gson.annotations.SerializedName

data class DataImage(
    @SerializedName("id")
    var id: Long? = null,
    @SerializedName("title")
    var title: String? = "",
    @SerializedName("desc")
    var desc: Any? = null,
    @SerializedName("md5")
    var md5: String? = "",
    @SerializedName("type")
    var type: Long? = null,
    @SerializedName("public")
    var public: Long? = null,
    @SerializedName("community")
    var community: Long? = null,
    @SerializedName("mimetype")
    var mimetype: String? = "",
    @SerializedName("originalName")
    var originalName: String? = "",
    @SerializedName("extension")
    var extension: String? = "",
    @SerializedName("size")
    var size: Long? = null,
    @SerializedName("duration")
    var duration: Float? = null,
    @SerializedName("density")
    var density: Long? = null,
    @SerializedName("channels")
    var channels: Long? = null,
    @SerializedName("height")
    var height: Long? = null,
    @SerializedName("width")
    var width: Long? = null,
    @SerializedName("displayRotate")
    var displayRotate: Long? = null,
    @SerializedName("storageID")
    var storageID: Long? = null,
    @SerializedName("path")
    var path: String? = null,
    @SerializedName("thumbPath")
    var thumbPath: String? = null,
    @SerializedName("viewCount")
    var viewCount: Long? = null,
    @SerializedName("wishCount")
    var wishCount: Long? = null,
    @SerializedName("likeCount")
    var likeCount: Long? = null,
    @SerializedName("gpsLongitude")
    var gpsLongitude: Float? = null,
    @SerializedName("gpsLatitude")
    var gpsLatitude: Float? = null,
    @SerializedName("posStreet")
    var posStreet: Any? = null,
    @SerializedName("posAddressNumber")
    var posAddressNumber: Any? = null,
    @SerializedName("posRegion")
    var posRegion: Any? = null,
    @SerializedName("posRegionCode")
    var posRegionCode: Any? = null,
    @SerializedName("posCountry")
    var posCountry: Any? = null,
    @SerializedName("posCountryCode")
    var posCountryCode: Any? = null,
    @SerializedName("posContinent")
    var posContinent: Any? = null,
    @SerializedName("activated")
    var activated: Long? = null,
    @SerializedName("deleted")
    var deleted: Long? = null,
    @SerializedName("removed")
    var removed: Long? = null,
    @SerializedName("hideWithCat")
    var hideWithCat: Long? = null,
    @SerializedName("isNarration")
    var isNarration: Long? = null,
    @SerializedName("producedAt")
    var producedAt: String? = null,
    @SerializedName("createdBy")
    var createdBy: Long? = null,
    @SerializedName("updatedBy")
    var updatedBy: Long? = null,
    @SerializedName("createdAt")
    var createdAt: String? = null,
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    @SerializedName("permission")
    var permission: Long? = null,

    var fromInternet: Boolean? = true
)
