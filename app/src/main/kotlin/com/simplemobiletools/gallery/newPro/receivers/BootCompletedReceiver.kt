package com.simplemobiletools.gallery.newPro.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.simplemobiletools.commons.helpers.ensureBackgroundThread
import com.simplemobiletools.gallery.newPro.extensions.updateDirectoryPath
import com.simplemobiletools.gallery.newPro.helpers.MediaFetcher

class BootCompletedReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        ensureBackgroundThread {
            MediaFetcher(context).getFoldersToScan().forEach {
                context.updateDirectoryPath(it)
            }
        }
    }
}
