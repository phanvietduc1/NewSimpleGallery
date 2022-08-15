package com.simplemobiletools.gallery.newPro.models.mapper

import com.example.simplegallery2.models.ImageDataResponse
import com.simplemobiletools.gallery.newPro.helpers.Mapper
import com.simplemobiletools.gallery.newPro.models.Medium

class sAssetMapper : Mapper<ImageDataResponse, List<Medium>>() {
    override fun map(input: ImageDataResponse): List<Medium> {
        val lstMedium = mutableListOf<Medium>()
        input.data?.forEach {
            lstMedium.add(Medium(
            ))
        }
        return lstMedium
    }
}
