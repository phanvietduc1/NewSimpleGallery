package com.example.simplegallery2.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import com.google.gson.annotations.SerializedName

data class DataImage(
    @SerializedName("id")
    var id: Long,
    @SerializedName("title")
    var title: String,
    @SerializedName("desc")
    var desc: Any,
    @SerializedName("md5")
    var md5: String,
    @SerializedName("type")
    var type: Int,
    @SerializedName("public")
    var public: Long,
    @SerializedName("community")
    var community: Long,
    @SerializedName("mimetype")
    var mimetype: String,
    @SerializedName("originalName")
    var originalName: String,
    @SerializedName("extension")
    var extension: String,
    @SerializedName("size")
    var size: Long,
    @SerializedName("duration")
    var duration: Float,
    @SerializedName("density")
    var density: Long,
    @SerializedName("channels")
    var channels: Long,
    @SerializedName("height")
    var height: Long,
    @SerializedName("width")
    var width: Long,
    @SerializedName("displayRotate")
    var displayRotate: Long,
    @SerializedName("storageID")
    var storageID: Long,
    @SerializedName("path")
    var path: String,
    @SerializedName("thumbPath")
    var thumbPath: String,
    @SerializedName("viewCount")
    var viewCount: Long,
    @SerializedName("wishCount")
    var wishCount: Long,
    @SerializedName("likeCount")
    var likeCount: Long,
    @SerializedName("gpsLongitude")
    var gpsLongitude: Float,
    @SerializedName("gpsLatitude")
    var gpsLatitude: Float,
    @SerializedName("posStreet")
    var posStreet: Any,
    @SerializedName("posAddressNumber")
    var posAddressNumber: Any,
    @SerializedName("posRegion")
    var posRegion: Any,
    @SerializedName("posRegionCode")
    var posRegionCode: Any,
    @SerializedName("posCountry")
    var posCountry: Any,
    @SerializedName("posCountryCode")
    var posCountryCode: Any,
    @SerializedName("posContinent")
    var posContinent: Any,
    @SerializedName("activated")
    var activated: Long,
    @SerializedName("deleted")
    var deleted: Long,
    @SerializedName("removed")
    var removed: Long,
    @SerializedName("hideWithCat")
    var hideWithCat: Long,
    @SerializedName("isNarration")
    var isNarration: Long,
    @SerializedName("producedAt")
    var producedAt: String,
    @SerializedName("createdBy")
    var createdBy: Long,
    @SerializedName("updatedBy")
    var updatedBy: Long,
    @SerializedName("createdAt")
    var createdAt: String,
    @SerializedName("updatedAt")
    var updatedAt: String,
    @SerializedName("permission")
    var permission: Long,

    var fromInternet: Boolean? = true
)
//@SerializedName("id")
//var id: Long,
//@SerializedName("title")
//var title: String,
//@SerializedName("desc") @ColumnInfo(name = "desc")
//var desc: String,
//@SerializedName("md5") @ColumnInfo(name = "md5")
//var md5: String,
//@SerializedName("type")
//var type: Long,
//@SerializedName("public") @ColumnInfo(name = "public")
//var public: Long,
//@SerializedName("community") @ColumnInfo(name = "community")
//var community: Long,
//@SerializedName("mimetype") @ColumnInfo(name = "mimetype")
//var mimetype: String,
//@SerializedName("originalName") @ColumnInfo(name = "originalName")
//var originalName: String,
//@SerializedName("extension") @ColumnInfo(name = "extension")
//var extension: String,
//@SerializedName("size")
//var size: Long,
//@SerializedName("duration") @ColumnInfo(name = "duration")
//var duration: Long,
//@SerializedName("density") @ColumnInfo(name = "density")
//var density: Long,
//@SerializedName("channels") @ColumnInfo(name = "channels")
//var channels: Long,
//@SerializedName("height") @ColumnInfo(name = "height")
//var height: Long,
//@SerializedName("width") @ColumnInfo(name = "width")
//var width: Long,
//@SerializedName("displayRotate") @ColumnInfo(name = "displayRotate")
//var displayRotate: Long,
//@SerializedName("storageID") @ColumnInfo(name = "storageID")
//var storageID: Long,
//@SerializedName("path") @ColumnInfo(name = "path")
//var path: String,
//@SerializedName("thumbPath") @ColumnInfo(name = "thumbPath")
//var thumbPath: String,
//@SerializedName("viewCount") @ColumnInfo(name = "viewCount")
//var viewCount: Long,
//@SerializedName("wishCount") @ColumnInfo(name = "wishCount")
//var wishCount: Long,
//@SerializedName("likeCount") @ColumnInfo(name = "likeCount")
//var likeCount: Long,
//@SerializedName("gpsLongitude") @ColumnInfo(name = "gpsLongitude")
//var gpsLongitude: String,
//@SerializedName("gpsLatitude") @ColumnInfo(name = "gpsLatitude")
//var gpsLatitude: String,
//@SerializedName("posStreet") @ColumnInfo(name = "posStreet")
//var posStreet: String,
//@SerializedName("posAddressNumber") @ColumnInfo(name = "posAddressNumber")
//var posAddressNumber: String,
//@SerializedName("posRegion") @ColumnInfo(name = "posRegion")
//var posRegion: String,
//@SerializedName("posRegionCode") @ColumnInfo(name = "posRegionCode")
//var posRegionCode: String,
//@SerializedName("posCountry") @ColumnInfo(name = "posCountry")
//var posCountry: String,
//@SerializedName("posCountryCode") @ColumnInfo(name = "posCountryCode")
//var posCountryCode: String,
//@SerializedName("posContinent") @ColumnInfo(name = "posContinent")
//var posContinent: String,
//@SerializedName("activated") @ColumnInfo(name = "activated")
//var activated: Long,
//@SerializedName("deleted") @ColumnInfo(name = "deleted")
//var deleted: Long,
//@SerializedName("removed") @ColumnInfo(name = "removed")
//var removed: Long,
//@SerializedName("hideWithCat") @ColumnInfo(name = "hideWithCat")
//var hideWithCat: Long,
//@SerializedName("isNarration") @ColumnInfo(name = "isNarration")
//var isNarration: Boolean? = false,
//@SerializedName("producedAt") @ColumnInfo(name = "producedAt")
//var producedAt: String,
//@SerializedName("createdBy") @ColumnInfo(name = "createdBy")
//var createdBy: Long,
//@SerializedName("updatedBy") @ColumnInfo(name = "updatedBy")
//var updatedBy: Long,
//@SerializedName("createdAt") @ColumnInfo(name = "createdAt")
//var createdAt: String,
//@SerializedName("updatedAt") @ColumnInfo(name = "updatedAt")
//var updatedAt: String,
//@SerializedName("permission") @ColumnInfo(name = "permission")
//var permission: Long,