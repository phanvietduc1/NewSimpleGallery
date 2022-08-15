package com.simplemobiletools.gallery.newPro.interfaces

import com.simplemobiletools.gallery.newPro.models.Directory
import java.io.File

interface DirectoryOperationsListener {
    fun refreshItems()

    fun deleteFolders(folders: ArrayList<File>)

    fun recheckPinnedFolders()

    fun updateDirectories(directories: ArrayList<Directory>)
}
