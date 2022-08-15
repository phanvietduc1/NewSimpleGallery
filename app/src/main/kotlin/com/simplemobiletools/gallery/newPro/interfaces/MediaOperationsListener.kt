package com.simplemobiletools.gallery.newPro.interfaces

import com.simplemobiletools.commons.models.FileDirItem
import com.simplemobiletools.gallery.newPro.models.ThumbnailItem

interface MediaOperationsListener {
    fun refreshItems()

    fun tryDeleteFiles(fileDirItems: ArrayList<FileDirItem>)

    fun selectedPaths(paths: ArrayList<String>)

    fun updateMediaGridDecoration(media: ArrayList<ThumbnailItem>)
}
