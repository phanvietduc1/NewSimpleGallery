package com.simplemobiletools.gallery.newPro.models.mapper

import com.example.simplegallery2.models.ImageDataResponse
import com.simplemobiletools.gallery.newPro.helpers.Mapper
import com.simplemobiletools.gallery.newPro.models.Medium
import com.simplemobiletools.gallery.newPro.models.ThumbnailItem

class sAssetMapper : Mapper<ImageDataResponse, ArrayList<Medium>>() {
    override fun map(input: ImageDataResponse): ArrayList<Medium> {
        val lstMedium = arrayListOf<Medium>()
        input.data?.forEach { data ->
            lstMedium.add(Medium(
                id = data.id,
                name = data.title,
                path = data.path,  // rong
                parentPath = data.path,
                modified = 0,
                taken = 0L,
                size = data.size,
                type = data.type,
                videoDuration = data.duration.toInt(),
                isFavorite = false,
                deletedTS = 0L,
                mediaStoreId = 0L,
                thumbPath = data.thumbPath,
                isFromS = true
            ))
        }
        return lstMedium
    }
}
